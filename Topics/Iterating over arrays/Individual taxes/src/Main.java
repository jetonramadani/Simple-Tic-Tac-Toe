import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        double maxTax = -1;
        int maxInd = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            double percent = sc.nextInt() / 100.;
            double payment = arr[i] * percent;
            if (payment > maxTax) {
                maxTax = payment;
                maxInd = i + 1;
            }
        }

        System.out.println(maxInd);
    }
}