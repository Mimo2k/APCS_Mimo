import java.util.Scanner;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        disp(a, 0);
        s.close();
    }

    public static void disp(int[] a, int i) {
        if (i == a.length) return;
        System.out.println(a[i]);
        disp(a, i + 1);
    }
}