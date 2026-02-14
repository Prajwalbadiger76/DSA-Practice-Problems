package String_Problems;

import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isValid("()"));      // true
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));      // false
        System.out.println(isValid("([)]"));    // false
        System.out.println(isValid("{[]}"));    // true
    }
}



//Cleaner Version

//class Solution {
//    public boolean isValid(String s) {
//
//        Map<Character, Character> map = new HashMap<>();
//        map.put(')', '(');
//        map.put('}', '{');
//        map.put(']', '[');
//
//        Stack<Character> stack = new Stack<>();
//
//        for (char ch : s.toCharArray()) {
//
//            if (!map.containsKey(ch)) {
//                stack.push(ch);
//            } 
//            else {
//                if (stack.isEmpty() || stack.pop() != map.get(ch))
//                    return false;
//            }
//        }
//
//        return stack.isEmpty();
//    }
//}
