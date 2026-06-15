import java.util.Scanner;

class Ac3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str = s.nextLine();
        System.out.print("Enter old substring: ");
        String oldSub = s.nextLine();
        System.out.print("Enter new substring: ");
        String newSub = s.nextLine();

        System.out.println("Modified string: " + str.replace(oldSub, newSub));
        s.close();
    }
}