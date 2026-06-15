import java.util.Scanner;

class Ac {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        System.out.print("Enter t1: ");
        int t1 = s.nextInt();
        System.out.print("Enter t2: ");
        int t2 = s.nextInt();
        System.out.print("Enter t3: ");
        int t3 = s.nextInt();

        toh(n, t1, t2, t3);
        s.close();
    }

    public static void toh(int n, int t1, int t2, int t3) {
        if (n == 0) return;

        toh(n - 1, t1, t3, t2);
        System.out.println(n + "[" + t1 + " -> " + t2 + "]");
        toh(n - 1, t3, t2, t1);
    }
}