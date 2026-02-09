package Array_Problems;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        // Loop from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // Set digit to 0 if it's 9
            digits[i] = 0;
        }

        // All digits were 9, create new array
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] digits1 = {1, 2, 3};
        printArray(plusOne(digits1)); // [1, 2, 4]

        // Test Case 2
        int[] digits2 = {4, 3, 2, 1};
        printArray(plusOne(digits2)); // [4, 3, 2, 2]

        // Test Case 3
        int[] digits3 = {9};
        printArray(plusOne(digits3)); // [1, 0]
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


