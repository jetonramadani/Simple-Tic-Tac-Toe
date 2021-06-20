import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("\\s+");
        int n = str.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int shift = sc.nextInt() % n;
        int[] help = new int[shift];
        System.arraycopy(arr, n - shift, help, 0, shift);
        System.arraycopy(arr, 0, arr, shift, n - shift);
        System.arraycopy(help, 0, arr, 0, shift);
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
    }
}