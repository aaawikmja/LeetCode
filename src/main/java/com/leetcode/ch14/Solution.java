package com.leetcode.ch14;


import java.util.TreeMap;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。

 示例 1:

 输入: ["flower","flow","flight"]
 输出: "fl"
 示例 2:

 输入: ["dog","racecar","car"]
 输出: ""
 解释: 输入不存在公共前缀。
 说明:

 所有输入只包含小写字母 a-z 。
 */
public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.longestCommonPrefix(new String[]{"aa","a"}));
    }

    public String longestCommonPrefix(String[] strs) {

        Trie t = new Trie();
        for (int i = 0;i < strs.length;i++) {
            t.add(strs[i]);
        }

        return  t.getlongestCommonPrefix();
    }


    public class  Trie  {

        public Node root;

        public boolean isEmpty;

        public int minSize = Integer.MAX_VALUE;


        public Trie(){
            root = new Node();
        }


        public String getlongestCommonPrefix(){
            if(isEmpty) {
                return "";
            }
            Node cur = root;
           StringBuilder sb = new StringBuilder();
           int index = 0;
            while (cur.next.size() == 1 && index < minSize){
                Character character = cur.next.firstKey();
                sb.append(character);
                cur = cur.next.get(character);
                index++;
            }
         return  sb.toString();
        }

        public void add(String str){

            Node cur = root;
            if(str.length() ==0){
                isEmpty =true;
                return;
            }
            minSize = Math.min(minSize,str.length());
            for(int i = 0; i < str.length();i++){
                Character c = str.charAt(i);
                if(cur.next.get(c) == null){
                    cur.next.put(c,new Node());
                }
                cur = cur.next.get(c);
            }

        }


       public class  Node{
           public TreeMap<Character,Node> next;


           public Node(){
               next = new TreeMap();
           }

       }




    }


}
