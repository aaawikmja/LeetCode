package com.leetcode.ch05;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

 示例 1：

 输入: "babad"
 输出: "bab"
 注意: "aba" 也是一个有效答案。
 示例 2：

 输入: "cbbd"
 输出: "bb"
 */
public class Solution {

    public   String longestPalindrome(String s) {
        String result = "";
        for (int i = 0;i < s.length();i++){

            String string = getLongString(s, i,i);
            result = result.length() > string.length() ? result : string;

            string = getLongString(s, i,i + 1);
            result = result.length() > string.length() ? result : string;
        }


         return result;
    }

    private    String  getLongString(String s, int left,int right) {


        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
        }


        return s.substring(left + 1,right);
    }




}
