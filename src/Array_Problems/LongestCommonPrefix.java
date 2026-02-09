package Array_Problems;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        // If array is empty or null, return empty string
        if (strs == null || strs.length == 0)
            return "";

        // First string is taken as initial prefix
        String prefix = strs[0];

        // Loop through remaining strings
        for (int i = 1; i < strs.length; i++) {

            // Shrink prefix until it matches the start of current string
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If no prefix remains
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {

        // Test Case 1
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Test case 1 : " + longestCommonPrefix(strs1)); // Output: fl

        // Test Case 2
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Test case 2 : " + longestCommonPrefix(strs2)); // Output: ""
    }
}

