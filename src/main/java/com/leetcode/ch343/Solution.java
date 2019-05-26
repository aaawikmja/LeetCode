package com.leetcode.ch343;

import java.util.HashMap;

public class Solution {

    public int integerBreak(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Integer integer = breakInterger(n,map);
        return integer;
    }

    private Integer breakInterger(int n,HashMap<Integer,Integer> map) {

        int result = -1;
        if (n == 1)
            return 1;

        if(map.get(n) != null) {
            return  map.get(n);
        }

        for (int i = 1;i <= n-1;i++) {
            result = Math.max(result, Math.max(i * (n - i),i * breakInterger(n - i,map)));
        }

        map.put(n,result);
        return  result;
    }





}
