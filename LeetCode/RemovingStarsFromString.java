package POTD.LeetCode;
import java.util.*;
/*
You are given a string s, which contains stars *.

In one operation, you can:
Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Input: s = "leet**cod*e"
Output: "lecoe"
Explanation: Performing the removals from left to right:
- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
There are no more stars, so we return "lecoe".

https://leetcode.com/problems/removing-stars-from-a-string/description/

TC: O(n)
SC: O(n)
*/


public class RemovingStarsFromString {
    public static String removeStars(String l) {
        // Create a new stack to keep track of characters encountered so far
        Stack<Character> s = new Stack<>();

        // Iterate over each character in the input string
        for (char c : l.toCharArray()) {
            // If the current character is a star, remove the topmost character from the stack
            if (c == '*') {
                s.pop();
            }
            // If the current character is not a star, add it to the stack
            else {
                s.push(c);
            }
        }

        // Create a new StringBuilder to store the characters in the stack
        StringBuilder sb = new StringBuilder();

        // Iterate over each character in the stack and append it to the StringBuilder
        for (char c : s) {
            sb.append(c);
        }

        // Convert the StringBuilder to a string and return it as the output
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "leet**cod*e";
        String result = removeStars(str);
        System.out.println(result);
    }
}

