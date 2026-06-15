import java.util.Scanner;

class Ac2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = s.nextInt();

        for (int d = 2; d * d <= n; d++) {
            while (n % d == 0) {
                n /= d;
                System.out.print(d + " ");
            }
        }
        
        if (n != 1) {
            System.out.print(n);
        }
        
        s.close();
    }
}