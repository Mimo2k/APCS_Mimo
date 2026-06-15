import java.util.Arrays;
import java.util.Scanner;

class Ac2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter str1: ");
        char[] s1 = s.nextLine().toCharArray();
        System.out.print("Enter str2: ");
        char[] s2 = s.nextLine().toCharArray();

        if (isAnagram(s1, s2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        s.close();
    }

    public static boolean isAnagram(char[] s1, char[] s2) {
        if (s1.length != s2.length) return false;
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
}