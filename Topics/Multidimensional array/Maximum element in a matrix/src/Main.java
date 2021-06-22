import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int row = -1;
        int col = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(row + " " + col);
    }
}