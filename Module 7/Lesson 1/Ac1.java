import java.util.Scanner;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = s.nextLine();
        
        String rev = new StringBuilder(str).reverse().toString();
        
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + rev);
        System.out.println("Concatenated: " + str + rev);
        s.close();
    }
}