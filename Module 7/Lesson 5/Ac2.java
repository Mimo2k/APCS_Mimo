import java.util.Scanner;

class Ac2 {
    private static final int D = 10;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.nextLine();
        String pat = s.nextLine();
        int q = s.nextInt();

        rabinKarp(pat, txt, q);
        s.close();
    }

    public static void rabinKarp(String pat, String txt, int q) {
        int m = pat.length(), n = txt.length();
        int p = 0, t = 0, h = 1;

        for (int i = 0; i < m - 1; i++) {
            h = (h * D) % q;
        }

        for (int i = 0; i < m; i++) {
            p = (D * p + pat.charAt(i)) % q;
            t = (D * t + txt.charAt(i)) % q;
        }

        for (int i = 0; i <= n - m; i++) {
            if (p == t) {
                int j = 0;
                while (j < m && txt.charAt(i + j) == pat.charAt(j)) j++;
                if (j == m) System.out.println(i + 1);
            }

            if (i < n - m) {
                t = (D * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
                if (t < 0) t += q;
            }
        }
    }
}