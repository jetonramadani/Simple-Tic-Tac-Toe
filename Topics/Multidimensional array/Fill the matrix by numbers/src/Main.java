import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        int increment;
        for (int i = 0; i < n; i++) {
            count = i;
            increment = -1;
            for (int j = 0; j < n; j++) {
                if (count == 0) {
                    increment = 1;
                }
                System.out.print(count + " ");
                count += increment;
            }
            System.out.println();
        }
    }
}