import java.util.Scanner;

class Ac1 {
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
        
        System.out.print("Enter row index to check: ");
        int rowIndex = s.nextInt();
        
        System.out.println(isNonZero(arr, rowIndex) ? "Non-zero row" : "Contains zero(s)");
        s.close();
    }

    public static boolean isNonZero(int[][] arr, int r) {
        for (int val : arr[r]) {
            if (val == 0) return false;
        }
        return true;
    }
}