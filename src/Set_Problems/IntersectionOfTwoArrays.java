package Set_Problems;

import java.util.*;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;

        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        printArray(intersection(nums1, nums2)); // Output: [2]

        // Test Case 2
        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};
        printArray(intersection(nums3, nums4)); // Output: [4,9] or [9,4]
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
