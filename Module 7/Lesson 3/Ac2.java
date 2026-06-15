import java.util.*;

class Ac2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        printFrequency(s.nextLine());
        System.out.print("Enter string 2: ");
        printFrequency(s.nextLine());
        s.close();
    }

    public static void printFrequency(String s) {
        if (s.isEmpty()) {
            System.out.println("Empty string");
            return;
        }

        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}