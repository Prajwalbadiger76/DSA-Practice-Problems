package Array_Problems;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        // Perform binary search
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        // Target not found, return insertion index
        return left;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {1, 3, 5, 6};
        System.out.println(searchInsert(nums1, 5)); // Output: 2

        // Test Case 2
        int[] nums2 = {1, 3, 5, 6};
        System.out.println(searchInsert(nums2, 2)); // Output: 1

        // Test Case 3
        int[] nums3 = {1, 3, 5, 6};
        System.out.println(searchInsert(nums3, 7)); // Output: 4
    }
}
