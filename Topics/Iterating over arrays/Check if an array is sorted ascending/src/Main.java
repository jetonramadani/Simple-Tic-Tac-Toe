import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int prev = sc.nextInt();
        boolean isOkay = true;
        while (sc.hasNextInt()) {
            int curr = sc.nextInt();
            if (prev > curr) {
                isOkay = false;
                break;
            }
            prev = curr;
        }
        System.out.println(isOkay);
    }
}