import java.util.Scanner;

class Ac2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = s.nextInt();

        if (n > 10) {
            System.out.println("Greater");
        } else {
            System.out.println("Smaller");
        }

        s.close();
    }
}