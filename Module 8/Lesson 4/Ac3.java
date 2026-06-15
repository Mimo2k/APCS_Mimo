import java.util.*;

class Ac3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        System.out.println("Factors: " + findFactors(n));
        s.close();
    }

    public static List<Integer> findFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) factors.add(n / i);
            }
        }
        Collections.sort(factors);
        return factors;
    }
}