import java.util.Scanner;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter str1: ");
        String s1 = s.nextLine();
        System.out.print("Enter str2: ");
        String s2 = s.nextLine();

        System.out.println(s1.contains(s2));
        s.close();
    }
}