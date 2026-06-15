import java.util.Scanner;

class Ac3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = s.nextLine();
        System.out.println(reverseWordsAndSentence(str));
        s.close();
    }

    public static String reverseWordsAndSentence(String str) {
        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            res.append(new StringBuilder(words[i]).reverse()).append(" ");
        }
        return res.toString().trim();
    }
}