package Set_Problems;

import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {1,2,3,1};
        System.out.println(containsDuplicate(nums1)); // true

        // Test Case 2
        int[] nums2 = {1,2,3,4};
        System.out.println(containsDuplicate(nums2)); // false

        // Test Case 3
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums3)); // true
    }
}


//Alternative Approach

//Arrays.sort(nums);
//for (int i = 1; i < nums.length; i++) {
//    if (nums[i] == nums[i - 1])
//        return true;
//}
//return false;

//Time: O(n log n)
//Space: O(1) (if sorting allowed)
