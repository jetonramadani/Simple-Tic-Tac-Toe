import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String check = sc.nextInt() + " " + sc.nextInt();
        String reverseCheck = check.charAt(2) + " " + check.charAt(0);
        System.out.println(!line.contains(check) && !line.contains(reverseCheck));
    }
}