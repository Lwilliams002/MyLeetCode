package LeetCode75.Array;

/*
Problem: 605. Can Place Flowers
Link: https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75

Description:
flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.


Time Complexity: O(n)
Space Complexity: O(n)

 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        int leftPointer = 0;
        int currentPointer = flowerbed[0];
        int count = 0;
        for(int rightPointer = 1; rightPointer < flowerbed.length; rightPointer++){
            if(currentPointer == 0 && currentPointer == leftPointer && currentPointer == flowerbed[rightPointer]){
                count++;
                leftPointer = 1;
            }else{
                leftPointer = currentPointer;
            }
            currentPointer = flowerbed[rightPointer];
        }
        if(leftPointer == 0 && leftPointer == currentPointer){
            count++;
        }
        return count >= n;
    }

    public static void main(String[] args) {
        CanPlaceFlowers planting = new CanPlaceFlowers();
        int i = 1;
        System.out.println(planting.canPlaceFlowers(new int[]{1, 0, 0, 0, 1},1));
    }
}
