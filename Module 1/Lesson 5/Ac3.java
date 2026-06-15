import java.util.Scanner;

class Ac3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char c;

        do {
            System.out.print("Enter number: ");
            n = s.nextInt();

            if (n > max) max = n;
            if (n < min) min = n;

            System.out.print("Continue (y/n)? ");
            c = s.next().charAt(0);
        } while (c == 'y' || c == 'Y');

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        
        s.close();
    }
}