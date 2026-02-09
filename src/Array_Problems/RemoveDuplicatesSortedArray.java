package Array_Problems;

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {

        // If array is empty
        if (nums.length == 0)
            return 0;

        // Index for unique elements
        int k = 1;

        // Traverse from second element
        for (int i = 1; i < nums.length; i++) {

            // Check if current element is different from last unique
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {1, 1, 2};
        System.out.print("Input Array: ");
        for(int num : nums1)  System.out.print(num + " ");
        System.out.println();
        
        int k1 = removeDuplicates(nums1);
        System.out.println("k = " + k1);
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        // Test Case 2
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.print("Input Array: ");
        for(int num : nums1)  System.out.print(num + " ");
        System.out.println();
        
        
        int k2 = removeDuplicates(nums2);
        System.out.println("k = " + k2);
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}

