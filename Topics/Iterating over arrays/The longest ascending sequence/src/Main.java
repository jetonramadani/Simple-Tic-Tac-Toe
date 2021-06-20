import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int prev = sc.nextInt();
        int maxCount = -1;
        int count = 1;
        while (sc.hasNextInt()) {
            int curr = sc.nextInt();
            if (prev < curr) {
                ++count;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    count = 1;
                }
            }
            prev = curr;
        }
        if (count > maxCount) {
            maxCount = count;
        }
        System.out.println(maxCount);

    }
}