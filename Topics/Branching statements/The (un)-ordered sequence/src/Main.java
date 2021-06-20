import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        boolean asc = true;
        boolean desc = true;
        int prev = sc.nextInt();
        while ((asc || desc) && sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (prev < n) {
                desc = false;
            } else if (prev > n) {
                asc = false;
            }
            prev = n;
        }
        System.out.println(asc || desc);
    }
}