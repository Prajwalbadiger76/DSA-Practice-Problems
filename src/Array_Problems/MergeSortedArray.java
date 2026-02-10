package Array_Problems;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge from back
        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements from nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test Case 2
        int[] nums3 = {1};
        merge(nums3, 1, new int[]{}, 0);
        for (int num : nums3) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test Case 3
        int[] nums4 = {0};
        merge(nums4, 0, new int[]{1}, 1);
        for (int num : nums4) {
            System.out.print(num + " ");
        }
    }
}
