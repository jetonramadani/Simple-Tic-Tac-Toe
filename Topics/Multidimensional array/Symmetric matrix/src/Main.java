import java.util.Scanner;

class Main {
    public static boolean checkSymmetry(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (mat[i][j] != mat[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // put your code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(checkSymmetry(mat, n) ? "YES" : "NO");
    }
}