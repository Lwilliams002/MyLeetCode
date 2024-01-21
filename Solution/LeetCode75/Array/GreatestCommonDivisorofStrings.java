package LeetCode75.Array;
/*
Problem: 1071. Greatest Common Divisor of Strings
Link: https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75

Description:
For two strings s and t, we say "t divides s" if and only if s = t + ... + t
(i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2,
return the largest string x such that x divides both str1 and str2.



Time Complexity: O(max(length of word1, length of word2)) O(n), where n is the length of the longer string.
Space Complexity: O(max(length of word1, length of word2))

 */
public class GreatestCommonDivisorofStrings {
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
}
