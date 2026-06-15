class Ac1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int s = x + y;
        int d = x - y;
        int m = x * y;
        int v = x / y;

        System.out.println("Part 1");
        System.out.println("Sum: " + s);
        System.out.println("Diff: " + d);
        System.out.println("Mult: " + m);
        System.out.println("Div: " + v);

        System.out.println("Part 2");
        System.out.println("Sum: " + (x + y));
        System.out.println("Diff: " + (x - y));
        System.out.println("Mult: " + (x * y));
        System.out.println("Div: " + (x / y));
        System.out.println("Mod: " + (x % y));

        System.out.println("Mimo");
        System.out.println((x + y) + " " + (x - y) + " " + (x * y) + " " + (x / y));
    }
}