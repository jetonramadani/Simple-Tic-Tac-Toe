import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String shape = sc.next();
        int a = sc.nextInt();
        int b;
        int c;
        double res;
        switch (shape) {
            case "triangle":
                b = sc.nextInt();
                c = sc.nextInt();
                double s = (a + b + c) / 2.;
                res = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                break;
            case "rectangle":
                b = sc.nextInt();
                res = a * b;
                break;
            case "circle":
                res = a * a * 3.14;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + shape);
        }
        System.out.println(res);
    }
}