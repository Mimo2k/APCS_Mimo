import java.util.Scanner;

class Ac3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Enter x: ");
        int x = s.nextInt();

        int[] o = find(a, 0, x, 0);
        for (int i = 0; i < o.length; i++) {
            System.out.print(o[i] + " ");
        }
        s.close();
    }

    public static int[] find(int[] a, int i, int x, int fs) {
        if (i == a.length) return new int[fs];
        if (a[i] == x) {
            int[] o = find(a, i + 1, x, fs + 1);
            o[fs] = i;
            return o;
        } else {
            return find(a, i + 1, x, fs);
        }
    }
}