import java.util.Scanner;

class Ac2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = s.nextInt();
        System.out.print("Enter x: ");
        int x = s.nextInt();

        System.out.println(search(a, 0, n - 1, x));
        s.close();
    }

    public static int search(int[] a, int l, int r, int x) {
        if (r >= l) {
            int m = l + (r - l) / 2;
            if (a[m] == x) return m;
            if (a[m] > x) return search(a, l, m - 1, x);
            return search(a, m + 1, r, x);
        }
        return -1;
    }
}