package Binary_Search_Problems;

public class SortedArrayToBST {

    // Definition of TreeNode
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private static TreeNode buildBST(int[] nums, int left, int right) {

        if (left > right)
            return null;

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);

        return root;
    }

    // Inorder traversal to verify BST
    public static void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {-10, -3, 0, 5, 9};
        TreeNode root1 = sortedArrayToBST(nums1);
        inorder(root1); // Output: -10 -3 0 5 9
        System.out.println();

        // Test Case 2
        int[] nums2 = {1, 3};
        TreeNode root2 = sortedArrayToBST(nums2);
        inorder(root2); // Output: 1 3
    }
}
