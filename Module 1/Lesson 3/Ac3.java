import java.util.Scanner;

class Ac3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int m = s.nextInt();

        if (m > 90) {
            System.out.println("O");
        } else if (m > 80 && m <= 90) {
            System.out.println("A+");
        } else if (m > 70 && m <= 80) {
            System.out.println("A");
        } else if (m > 60 && m <= 70) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        
        s.close();
    }
}