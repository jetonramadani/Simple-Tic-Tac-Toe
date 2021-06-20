import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long fact = 1;
        int n = 1;
        while (fact <= num) {
            fact *= ++n;
        }
        System.out.println(n);
    }
}