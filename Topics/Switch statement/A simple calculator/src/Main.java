import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split("\\s+");
        long num1 = Long.parseLong(parts[0]);
        long num2 = Long.parseLong(parts[2]);
        switch (parts[1]) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;

            case "*":
                System.out.println(num1 * num2);
                break;

            case "/":
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Division by 0!");
                }
                break;

            default:
                System.out.println("Unknown operator");
                break;

        }
    }
}