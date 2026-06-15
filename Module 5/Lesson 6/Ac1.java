import java.util.*;

class Ac1 {
    static int N = 4;
    static int[] ld = new int[30], rd = new int[30], cl = new int[30];

    public static void main(String[] args) {
        int[][] b = new int[N][N];
        if (solve(b, 0)) print(b);
        else System.out.println("No solution");
    }

    public static boolean solve(int[][] b, int c) {
        if (c >= N) return true;
        for (int i = 0; i < N; i++) {
            if (ld[i - c + N - 1] == 0 && rd[i + c] == 0 && cl[i] == 0) {
                b[i][c] = 1;
                ld[i - c + N - 1] = rd[i + c] = cl[i] = 1;
                if (solve(b, c + 1)) return true;
                b[i][c] = 0;
                ld[i - c + N - 1] = rd[i + c] = cl[i] = 0;
            }
        }
        return false;
    }

    public static void print(int[][] b) {
        for (int[] r : b) {
            for (int x : r) System.out.print(x + " ");
            System.out.println();
        }
    }
}