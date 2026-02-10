package Array_Problems;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int k = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {

            // Copy only elements that are not equal to val
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = removeElement(nums1, val1);
        System.out.println("k = " + k1);
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        // Test Case 2
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        int k2 = removeElement(nums2, val2);
        System.out.println("k = " + k2);
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}
