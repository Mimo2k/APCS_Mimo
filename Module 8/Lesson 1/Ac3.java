import java.util.Scanner;

class Ac3 {
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

        int[] maxRow = getRowWithMaxSum(arr);
        System.out.print("Row with max sum: ");
        for (int val : maxRow) System.out.print(val + " ");
        s.close();
    }

    public static int[] getRowWithMaxSum(int[][] arr) {
        int[] maxRow = arr[0];
        int maxSum = Integer.MIN_VALUE;

        for (int[] row : arr) {
            int currentSum = 0;
            for (int val : row) currentSum += val;
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxRow = row;
            }
        }
        return maxRow;
    }
}