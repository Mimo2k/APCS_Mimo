import java.util.Scanner;

class Ac2 {
    static int a = 0, b = 1, c = 0;

    static void solve(int n) {
        if (n > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            solve(n - 1);
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        System.out.print(a + " " + b);
        solve(n - 2);
        s.close();
    }
}