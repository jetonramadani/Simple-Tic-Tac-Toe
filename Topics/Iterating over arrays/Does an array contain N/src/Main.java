import java.util.Scanner;

class Main {
    public static boolean contains(int[] arr, int num) {
        for (int n : arr) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(contains(arr, sc.nextInt()));
    }
}