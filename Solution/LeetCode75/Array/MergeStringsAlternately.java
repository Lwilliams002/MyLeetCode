package LeetCode75.Array;
/*
Problem: 1768. Merge Strings Alternately
Link: https://leetcode.com/problems/merge-strings-alternately/

Description:
You are given two strings word1 and word2.
Merge the strings by adding letters in alternating order, starting with word1.
If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Time Complexity: O(max(length of word1, length of word2)) O(n), where n is the length of the longer string.
Space Complexity: O(max(length of word1, length of word2))

 */


public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (j < word2.length()) {
                sb.append(word2.charAt(j));
            }
            i++;
            j++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately merger = new MergeStringsAlternately();

        // Test case
        String result = merger.mergeAlternately("abc", "123");
        System.out.println("Merged LeetCode75.String: " + result);
    }
}


/*
Notes:

Inefficient string concatenation using " + "
LeetCode75.String inefficientConcatenation(LeetCode75.String[] words) {
    LeetCode75.String result = "";
    for (LeetCode75.String word : words) {
        result += word;
    }
    return result;
}

Efficient string concatenation using StringBuilder
LeetCode75.String efficientConcatenation(LeetCode75.String[] words) {
    StringBuilder sb = new StringBuilder();
    for (LeetCode75.String word : words) {
        sb.append(word);
    }
    return sb.toString();
}

Using StringBuilder for string concatenation in a loop is more efficient than
directly concatenating strings with the + operator, especially when dealing with large
strings or a large number of concatenations. This is because strings in Java are
immutable, meaning each time you concatenate them, a new string object is created.
This can lead to unnecessary memory allocations and can be inefficient in terms of
both time and space complexity.
    - it doesn't create a new object each time you modify it.
 */
