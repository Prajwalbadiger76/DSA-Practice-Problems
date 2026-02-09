package String_Problems;

import java.util.Arrays;

public class FindKthSmallest {

    public static int findKthSmallest(int[] arr, int k) {
        // Sort the array
        Arrays.sort(arr);

        // Return k-th smallest element
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {108, 221, 193, 344, 124, 134, 115, 164};
        int k = 3;

        int result = findKthSmallest(arr, k);
        System.out.println(result);
    }
}
