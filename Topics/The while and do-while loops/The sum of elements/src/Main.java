import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(reader.lines()
                .mapToInt(Integer::parseInt)
                .takeWhile(num -> num != 0)
                .sum());
    }
}