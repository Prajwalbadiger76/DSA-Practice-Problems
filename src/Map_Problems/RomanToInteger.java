package Map_Problems;

import java.util.*;

public class RomanToInteger {

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = map.get(s.charAt(i));

            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));     // 3
        System.out.println(romanToInt("LVIII"));   // 58
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }
}


// Even Cleaner Version (Without HashMap – Faster)

// class Solution {
//     public int romanToInt(String s) {
//
//        int result = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//
//            int current = getValue(s.charAt(i));
//
//            if (i < s.length() - 1 && current < getValue(s.charAt(i + 1))) {
//                result -= current;
//            } else {
//                result += current;
//            }
//        }
//
//        return result;
//    }
//
//     private int getValue(char c) {
//        switch (c) {
//            case 'I': return 1;
//            case 'V': return 5;
//            case 'X': return 10;
//            case 'L': return 50;
//            case 'C': return 100;
//            case 'D': return 500;
//            case 'M': return 1000;
//         }
//         return 0;
//     }
// }
//
