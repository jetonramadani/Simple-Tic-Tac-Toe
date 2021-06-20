import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 2; i < n; i++) {
            if (arr[i - 2] + 1 == arr[i - 1] && arr[i - 1] + 1 == arr[i]) {
                ++count;
            }
        }
        System.out.println(count);
    }
}