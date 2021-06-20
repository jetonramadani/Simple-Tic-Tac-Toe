import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (count + i > n) {
                System.out.print((i + " ").repeat(n - count));
            } else {
                System.out.print((i + " ").repeat(i));
            }
            count += i;
            if (count >= n) {
                break;
            }
        }
    }
}