import java.util.Arrays;
import java.util.Scanner;

class Ac2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();

        System.out.print("Enter start and end indices: ");
        int start = s.nextInt();
        int end = s.nextInt();

        int[] sub = Arrays.copyOfRange(arr, start, end + 1);
        System.out.println("Sub-array: " + Arrays.toString(sub));
        s.close();
    }
}