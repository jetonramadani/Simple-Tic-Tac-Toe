import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        IntStream.generate(sc::nextInt)
                .takeWhile(num -> num != 0)
                .mapToObj(num -> num % 2 == 0 ? "even" : "odd")
                .forEach(System.out::println);
    }
}