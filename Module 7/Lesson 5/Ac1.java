import java.util.Scanner;

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt = s.nextLine();
        System.out.print("Enter pattern: ");
        String pat = s.nextLine();

        kmpSearch(pat, txt);
        s.close();
    }

    public static void kmpSearch(String pat, String txt) {
        int m = pat.length(), n = txt.length();
        int[] lps = computeLPS(pat);
        int i = 0, j = 0;
        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) { i++; j++; }
            if (j == m) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1];
            } else if (i < n && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
    }

    private static int[] computeLPS(String pat) {
        int m = pat.length(), len = 0, i = 1;
        int[] lps = new int[m];
        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) lps[i++] = ++len;
            else if (len != 0) len = lps[len - 1];
            else lps[i++] = 0;
        }
        return lps;
    }
}