import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int bridges = sc.nextInt();
        long unCrashed = IntStream.generate(sc::nextInt)
                .limit(bridges)
                .takeWhile(h -> h > num)
                .count();
        if (unCrashed == bridges) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + (unCrashed + 1));
        }
    }
}