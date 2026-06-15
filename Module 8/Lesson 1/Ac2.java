import java.util.Scanner;

class Ac2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) arr[i][j] = s.nextInt();
        }

        System.out.println("Non-zero rows: " + countNonZero(arr));
        s.close();
    }

    public static int countNonZero(int[][] arr) {
        int count = 0;
        for (int[] row : arr) {
            if (isNonZero(row)) count++;
        }
        return count;
    }

    private static boolean isNonZero(int[] row) {
        for (int val : row) {
            if (val == 0) return false;
        }
        return true;
    }
}