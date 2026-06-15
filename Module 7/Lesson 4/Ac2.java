import java.util.Scanner;

class Ac2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str = s.nextLine();
        System.out.print("Enter substring: ");
        String sub = s.nextLine();

        System.out.println(countFreq(str, sub));
        s.close();
    }

    public static int countFreq(String str, String sub) {
        if (sub.isEmpty()) return 0;
        int count = 0, idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }
}