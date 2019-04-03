package com.leetcode.ch18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。

 注意：

 答案中不可以包含重复的四元组。

 示例：

 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。

 满足要求的四元组集合为：
 [
 [-1,  0, 0, 1],
 [-2, -1, 1, 2],
 [-2,  0, 0, 2]
 ]
 */
public class Solution {


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-3,-2,-1,0,0,1,2,3};
        System.out.println(s.fourSum(nums,0));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 3;i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1;j < nums.length - 2;j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                sum = nums[i] + nums[j];
                int left = j + 1,right = nums.length - 1;

                while (left < right) {

                    if(sum + nums[left] + nums[right] == target) {

                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));

                        while (left < right && nums[left] == nums[left+1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;

                    } else if(sum + nums[left] + nums[right] < target) {
                        left++;
                    } else  if(sum + nums[left] + nums[right] > target) {
                        right--;
                    }

                }





            }


        }

        return result;

    }

}



