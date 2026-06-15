class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println("Guess");
        System.out.println("Unary: " + (x++));
        System.out.println("Unary: " + (++y));
        System.out.println("Binary");
        System.out.println("1+2 " + 1 + 2);
        System.out.println("1+2 " + (1 + 2));
        System.out.println((1 + 2) + " =3");

        int z = ++x * y++;
        System.out.println(z);
        
        System.out.println("Ternary");
        int res = (x > y) ? x : y;
        System.out.println("Result: " + res);
    }
}