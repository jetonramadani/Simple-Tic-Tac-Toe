import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int temp = arr[n - 1];
        System.arraycopy(arr, 0, arr, 1, n - 1);
        arr[0] = temp;
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }
}