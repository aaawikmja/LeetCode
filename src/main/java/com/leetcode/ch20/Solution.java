package com.leetcode.ch20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

 有效字符串需满足：

 左括号必须用相同类型的右括号闭合。
 左括号必须以正确的顺序闭合。
 注意空字符串可被认为是有效字符串。

 示例 1:

 输入: "()"
 输出: true
 示例 2:

 输入: "()[]{}"
 输出: true
 示例 3:

 输入: "(]"
 输出: false
 示例 4:

 输入: "([)]"
 输出: false
 示例 5:

 输入: "{[]}"
 输出: true
 */
public class Solution {


    public  static boolean isValid(String s) {

        List<Character> list = new ArrayList<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for (int i = 0;i < s.length();i++){


            if(map.containsKey(s.charAt(i))){
                if(list.size() > 0){

                    if(map.get(s.charAt(i)).equals(list.get(0))){
                        list.remove(0);
                        continue;
                    }
                    return false;

                }
            }
            list.add(0,s.charAt(i));
        }

        return list.isEmpty();

//            if(s.charAt(i) == ')'){
//
//                 if(list.size() > 0){
//
//                    if(list.get(0) == '('){
//                        list.remove(0);
//                        continue;
//                    }
//                    return false;
//
//                 }
//
//            }else if(s.charAt(i) == ']'){
//
//                if(list.size() > 0){
//
//                    if(list.get(0) == '['){
//                        list.remove(0);
//                        continue;
//                    }
//                    return false;
//                }
//
//            }else if(s.charAt(i) == '}'){
//                    if(list.size() > 0){
//
//                        if(list.get(0) == '{'){
//                            list.remove(0);
//                            continue;
//                        }
//                        return false;
//                    }
//            }



    }


    public static void main(String[] args) {
        String s = "}";
        System.out.println(isValid(s));
    }

}
