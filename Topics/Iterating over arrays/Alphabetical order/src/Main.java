import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String prev = sc.next();
        boolean isOkay = true;
        while (sc.hasNext()) {
            String curr = sc.next();
            if (prev.compareTo(curr) > 0) {
                isOkay = false;
                break;
            }
            prev = curr;
        }
        System.out.println(isOkay);
    }
}