package Map_Problems;

import java.util.*;

public class ContainsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums1, 3)); // true

        // Test Case 2
        int[] nums2 = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums2, 1)); // true

        // Test Case 3
        int[] nums3 = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(nums3, 2)); // false
    }
}
