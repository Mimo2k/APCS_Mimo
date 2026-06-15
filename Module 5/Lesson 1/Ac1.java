import java.util.Scanner;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        solve(n);
        s.close();
    }

    public static void solve(int n) {
        if (n == 0) return;
        System.out.println(n);
        solve(n - 1);
    }
}