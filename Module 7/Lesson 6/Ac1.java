import java.util.Scanner;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String str = s.nextLine().trim();
            if (str.equalsIgnoreCase("exit")) break;
            System.out.println(isValid(str));
        }
        s.close();
    }

    public static boolean isValid(String str) {
        if (str == null || str.isEmpty()) return false;
        if (!Character.isLetter(str.charAt(0)) && str.charAt(0) != '_') return false;
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '_') return false;
        }
        return true;
    }
}