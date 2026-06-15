import java.util.*;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();

        int[] dupes = findDuplicates(arr);
        System.out.println("Duplicates: " + Arrays.toString(dupes));
        s.close();
    }

    public static int[] findDuplicates(int[] arr) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> dupes = new HashSet<>();

        for (int num : arr) {
            if (!unique.add(num)) dupes.add(num);
        }

        int[] res = new int[dupes.size()];
        int i = 0;
        for (int num : dupes) res[i++] = num;
        return res;
    }
}