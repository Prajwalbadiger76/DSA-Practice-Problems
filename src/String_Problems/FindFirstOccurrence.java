package String_Problems;

public class FindFirstOccurrence {

    public static int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(strStr("sadbutsad", "sad"));   // 0
        System.out.println(strStr("leetcode", "leeto"));  // -1
    }
}
