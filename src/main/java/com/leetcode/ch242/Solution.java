package com.leetcode.ch242;

import java.util.*;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。

 示例 1:

 输入: s = "anagram", t = "nagaram"
 输出: true
 示例 2:

 输入: s = "rat", t = "car"
 输出: false
 说明:
 你可以假设字符串只包含小写字母。

 */
public class Solution {


    public  boolean isAnagram(String s, String t) {



        Map<Character, Integer> sMap = getMap(s);
        Map<Character, Integer> tMap = getMap(t);


        return sMap.equals(tMap);
    }


    private Map<Character,Integer> getMap(String s){
        Character c;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length();i++){
            c = s.charAt(i);
            if(map.containsKey(c)){
                Integer integer = map.get(c);
                map.put(c,++integer);
            }else {
                map.put(c,0);
            }
        }
        return  map;
    }




    public boolean isAnagram02(String s, String t) {

        char[] arrayCh = s .toCharArray();
        Arrays.sort(arrayCh);
        s = Arrays.toString(arrayCh);


        arrayCh = s .toCharArray();
        Arrays.sort(arrayCh);
        t = Arrays.toString(arrayCh);

        return  s.equals(t);
    }

}
