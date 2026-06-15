import java.util.Scanner;

class Ac2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        dispRev(a, 0);
        s.close();
    }

    public static void dispRev(int[] a, int i) {
        if (i == a.length) return;
        dispRev(a, i + 1);
        System.out.println(a[i]);
    }
}