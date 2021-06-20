import java.util.*;

public class Main {
    private static final Scanner SC = new Scanner(System.in);
    private static void readArray(int[] arr) {
        for (int i = 0; i < 3; i++) {
            arr[i] = SC.nextInt();
        }
        Arrays.sort(arr);
    }
    private static boolean accepts(int[] arr1, int[] arr2) {
        for (int i = 0; i < 3; i++) {
            if (arr1[i] >= arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // write your code here
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        readArray(arr1);
        readArray(arr2);
        if (accepts(arr1, arr2)) {
            System.out.println("Box 1 < Box 2");
        } else if (accepts(arr2, arr1)) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}
