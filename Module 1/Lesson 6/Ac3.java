import java.util.Scanner;

class Ac3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter low: ");
        int l = s.nextInt();
        System.out.print("Enter high: ");
        int h = s.nextInt();

        for (int n = l; n <= h; n++) {
            if (n <= 1) continue;
            
            int c = 0;
            for (int d = 2; d * d <= n; d++) {
                if (n % d == 0) {
                    c++;
                    break;
                }
            }
            
            if (c == 0) {
                System.out.println(n);
            }
        }
        
        s.close();
    }
}