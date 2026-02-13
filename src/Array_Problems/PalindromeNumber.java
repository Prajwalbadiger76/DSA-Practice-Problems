package Array_Problems;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));  // true
        System.out.println(isPalindrome(-121)); // false
        System.out.println(isPalindrome(10));   // false
    }
}


// Optimized Solution


//  class Solution {
//      public boolean isPalindrome(int x) {
//
//          if (x < 0 || (x % 10 == 0 && x != 0))
//              return false;
//
//          int reversedHalf = 0;
//
//          while (x > reversedHalf) {
//              reversedHalf = reversedHalf * 10 + x % 10;
//              x /= 10;
//          }
//
//          return x == reversedHalf || x == reversedHalf / 10;
//      }  
//  }
