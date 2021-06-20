import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int maxInd = -1;
        for (int i = 0; i < n; i++) {
            int curr = sc.nextInt();
            if (max < curr) {
                max = curr;
                maxInd = i;
            }
        }
        System.out.println(maxInd);
    }
}