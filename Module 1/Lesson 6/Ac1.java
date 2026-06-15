import java.util.Scanner;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter t: ");
        int t = s.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.print("Enter n: ");
            int n = s.nextInt();

            int c = 0;
            for (int d = 2; d * d <= n; d++) {
                if (n % d == 0) {
                    c++;
                    break;
                }
            }

            if (n <= 1) {
                System.out.println("not prime");
            } else if (c == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
        
        s.close();
    }
}