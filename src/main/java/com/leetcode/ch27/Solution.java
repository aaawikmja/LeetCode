package com.leetcode.ch27;

import java.util.Arrays;

public class Solution {

    public int removeElement(int[] nums, int val) {

        int i = 0;
        for (int j = 0;j < nums.length ; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(s.removeElement(nums,2));
        for (int i : nums) {
            System.out.print(i + "   ");
        }
    }

}
