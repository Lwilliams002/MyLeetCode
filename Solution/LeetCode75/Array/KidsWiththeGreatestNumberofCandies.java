package LeetCode75.Array;
import java.util.ArrayList;
import java.util.List;

/*
Problem: 1431. Kids With the Greatest Number of Candies
Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75

Description:
You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.


Time Complexity: O(n)
Space Complexity: O(n)

 */

public class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for(int candy : candies){
            maxCandies = Math.max(candy, maxCandies);
        }
        List<Boolean> results = new ArrayList<>();
        for(int candy : candies){
            results.add(candy + extraCandies >= maxCandies);
        }
        return results;
    }

    public static void main(String[] args) {
        KidsWiththeGreatestNumberofCandies candy = new KidsWiththeGreatestNumberofCandies();
        int[] array = {2,3,5,7,9};
        System.out.println(candy.kidsWithCandies(array,3));
    }
}


/*
Focus on finding the maximum number of candies first. This allows for efficient comparisons in the second loop.

Use the Math.max function for concise maximum value comparison.
The Java.lang.math.max() function is an inbuilt function in Java which returns maximum of two numbers

Consider potential optimizations:
If the extraCandies value is greater than or equal to the maximum candies, all kids can have the greatest number, so you can return a list filled with true values.
If the extraCandies value is 0, the results will simply reflect whether each kid already has the maximum candies.
*/