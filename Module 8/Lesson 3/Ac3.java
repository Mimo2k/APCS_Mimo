import java.util.*;

class Ac3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter size of array 1: ");
        int[] arr1 = readArray(s, s.nextInt());
        System.out.print("Enter size of array 2: ");
        int[] arr2 = readArray(s, s.nextInt());

        System.out.println("Unique elements: " + Arrays.toString(getUnique(arr1, arr2)));
        s.close();
    }

    private static int[] readArray(Scanner s, int n) {
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();
        return arr;
    }

    public static int[] getUnique(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);

        int[] res = new int[set.size()];
        int i = 0;
        for (int num : set) res[i++] = num;
        return res;
    }
}