package com.leetcode.ch16;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.

 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {-3,-2,-5,3,-4};

        System.out.println(s.threeSumClosest(num,-1));
    }


    public int threeSumClosest(int[] nums, int target) {

        int result = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0;i < nums.length -2;i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1,right = nums.length-1;

            while (left < right) {

            int  sum = nums[i] + nums[left] + nums[right];

               if(Math.abs(sum - target) < Math.abs(result - target)){
                     result = sum;
               }

               if(target > sum) {
                   left++;
               } else if(target < sum) {
                   right--;
               } else {
                  return sum;
               }

            }

        }
        return  result;
    }

}
