import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int max = -1;
        for (int i = 1; i < n; i++) {
            int curr = sc.nextInt();
            if (prev * curr > max) {
                max = prev * curr;
            }
            prev = curr;
        }
        System.out.println(max);
    }
}