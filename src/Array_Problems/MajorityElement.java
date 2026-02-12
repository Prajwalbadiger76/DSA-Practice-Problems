package Array_Problems;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {3,2,3};
        System.out.println(majorityElement(nums1)); // Output: 3

        // Test Case 2
        int[] nums2 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums2)); // Output: 2
    }
}
