package String_Problems;

//Input 1 : abcxcba   |    Output 1 : YES
//Input 2 : abcd      |    Output 2 : NO 

import java.util.*;

public class BalancedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) {
            System.out.println("NO");
            return;
        }

        String s = sc.nextLine().toLowerCase().trim();

        int n = s.length();
        if (n == 0) {
            System.out.println("NO");
            return;
        }

        int mid = n / 2;
        int leftSum = 0;
        int rightSum = 0;

        // Left half
        for (int i = 0; i < mid; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                leftSum += (ch - 'a' + 1);
            }
        }

        // Right half
        int start = (n % 2 == 0) ? mid : mid + 1;

        for (int i = start; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                rightSum += (ch - 'a' + 1);
            }
        }

        if (leftSum == rightSum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}



