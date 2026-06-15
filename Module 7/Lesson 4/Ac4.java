import java.util.Scanner;

class Ac4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter str1: ");
        String s1 = s.nextLine();
        System.out.print("Enter str2: ");
        String s2 = s.nextLine();

        int res = s1.compareTo(s2);

        if (res == 0) {
            System.out.println("Strings are equal.");
        } else if (res < 0) {
            System.out.println("First string is lexicographically smaller.");
        } else {
            System.out.println("First string is lexicographically larger.");
        }
        s.close();
    }
}