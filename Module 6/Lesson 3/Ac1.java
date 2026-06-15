import java.util.Scanner;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = s.nextInt();

        selectionSort(a);
        for (int x : a) System.out.print(x + " ");
        s.close();
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) minIdx = j;
            }
            int t = a[minIdx];
            a[minIdx] = a[i];
            a[i] = t;
        }
    }
}