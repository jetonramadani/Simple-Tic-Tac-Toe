import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(IntStream.generate(sc::nextInt)
                .limit(n).sum());
    }
}