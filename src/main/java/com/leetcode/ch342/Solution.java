package com.leetcode.ch342;

/**
 * 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。

 示例 1:

 输入: 16
 输出: true
 示例 2:

 输入: 5
 输出: false
 */
public class Solution {

    public boolean isPowerOfFour(int num) {
        if(num <= 0) return false;
        return  ((num & -num) == num) && ((0x55555555 & num) == num);
    }

}
