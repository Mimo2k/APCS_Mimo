import java.util.*;

class Ac2 {
    static String[] codes = {".", ";", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = s.next();
        List<String> res = getKPC(str);
        System.out.println(res);
        s.close();
    }

    public static List<String> getKPC(String str) {
        if (str.length() == 0) {
            List<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        List<String> rres = getKPC(ros);
        List<String> mres = new ArrayList<>();

        String code = codes[ch - '0'];
        for (char c : code.toCharArray()) {
            for (String val : rres) {
                mres.add(c + val);
            }
        }
        return mres;
    }
}