package Array_Problems;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int k = 0;

        // Shift non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Fill remaining with zeros
        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {0,1,0,3,12};
        moveZeroes(nums1);
        printArray(nums1); // Output: 1 3 12 0 0

        // Test Case 2
        int[] nums2 = {0};
        moveZeroes(nums2);
        printArray(nums2); // Output: 0
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
