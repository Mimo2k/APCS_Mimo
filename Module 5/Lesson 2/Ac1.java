import java.util.Scanner;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = s.nextInt();
        System.out.print("Enter n: ");
        int n = s.nextInt();
        System.out.println(pow(x, n));
        s.close();
    }

    public static int pow(int x, int n) {
        if (n == 0) return 1;
        int half = pow(x, n / 2);
        int res = half * half;
        if (n % 2 != 0) res *= x;
        return res;
    }
}