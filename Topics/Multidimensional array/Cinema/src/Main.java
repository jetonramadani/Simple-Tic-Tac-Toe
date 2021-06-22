import java.util.Arrays;
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
        String pattern = "0, ".repeat(sc.nextInt()).trim();
        pattern = pattern.substring(0, pattern.length() - 1);
        int row = 0;
        for (int i = 0; i < n; i++) {
            if (Arrays.toString(mat[i]).contains(pattern)) {
                row = i + 1;
                break;
            }
        }
        System.out.println(row);
    }
}