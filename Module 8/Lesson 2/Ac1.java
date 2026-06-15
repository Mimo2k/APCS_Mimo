import java.util.*;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();

        int[] result = removeDuplicates(arr);
        System.out.println("Result: " + Arrays.toString(result));
        s.close();
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int val : arr) set.add(val);
        
        int[] res = new int[set.size()];
        int i = 0;
        for (int val : set) res[i++] = val;
        return res;
    }
}