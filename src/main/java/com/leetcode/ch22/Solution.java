package com.leetcode.ch22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。

 例如，给出 n = 3，生成结果为：

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]
 */
public class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        getResult(0,0,n,"",result);
        return result;
    }


    public  void  getResult(int left,int right,int n,String s,List<String> result){


        if(left > n || right > n) {
            return;
        }

        if(left == right && left == n && right == n) {
            result.add(s);
        }

        if(right <= left) {
            getResult(left + 1,right,n,s+"(",result);
            getResult(left,right + 1,n,s+")",result);
        }

    }




    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.generateParenthesis(3));
    }

}


