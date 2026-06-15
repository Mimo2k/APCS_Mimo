import java.util.*;

class Ac4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n (size of array): ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter n numbers (1 to n+1):");
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();

        System.out.println("Missing number: " + findMissing(arr, n));
        s.close();
    }

    public static int findMissing(int[] arr, int n) {
        int expectedSum = (n + 1) * (n + 2) / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        return expectedSum - actualSum;
    }
}