import java.util.Scanner;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = s.nextLine();
        System.out.println("String: " + str);

        System.out.print("Enter int: ");
        int n = s.nextInt();
        System.out.println("Int: " + n);

        System.out.print("Enter float: ");
        float f = s.nextFloat();
        System.out.println("Float: " + f);

        s.close();
    }
}