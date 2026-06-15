import java.util.Scanner;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = s.nextInt();
        System.out.print("Enter x: ");
        int x = s.nextInt();

        System.out.println(search(a, x));
        s.close();
    }

    public static int search(int[] a, int x) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == x) return m;
            if (a[m] < x) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}