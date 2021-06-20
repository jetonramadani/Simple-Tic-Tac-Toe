import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double p = sc.nextDouble() / 100;
        double  k = sc.nextDouble();
        int count = 0;
        while (m < k) {
            m = m * (1 + p);
            ++count;
        }
        System.out.println(count);
    }
}