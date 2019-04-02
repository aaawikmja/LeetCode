package com.leetcode.ch17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static final Map<Character,String> map = new HashMap<>();

    static {
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }


    public List<String> letterCombinations(String digits) {

        if(digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        getResult("",digits,0,result);

        return result;
    }


    public void getResult(String s,String digits,int start,List<String> result){
        if(start >= digits.length()){
            result.add(s);
        }else {
           String str = map.get(digits.charAt(start));
            for (int i = 0;i < str.length();i++){
                getResult(s+str.charAt(i),digits,(start+1),result);
            }
        }

    }


}
