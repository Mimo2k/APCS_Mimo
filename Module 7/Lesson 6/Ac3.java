import java.util.*;

class Ac3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = s.nextLine();
        System.out.println("Longest unique substring: " + longestUnique(str));
        s.close();
    }

    public static String longestUnique(String str) {
        if (str == null || str.isEmpty()) return "";
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, maxLen = 0, maxStart = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1;
            }
            map.put(c, i);
            if (i - start + 1 > maxLen) {
                maxLen = i - start + 1;
                maxStart = start;
            }
        }
        return str.substring(maxStart, maxStart + maxLen);
    }
}