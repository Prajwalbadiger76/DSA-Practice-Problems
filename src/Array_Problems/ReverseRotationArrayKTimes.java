package Array_Problems;

import java.util.*;

// Optimized Solution

public class ReverseRotationArrayKTimes {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        K = K % N;

        // Step 1: Reverse entire array
        reverse(arr, 0, N - 1);

        // Step 2: Reverse first K elements
        reverse(arr, 0, K - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, K, N - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

