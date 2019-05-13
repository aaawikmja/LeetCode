package com.leetcode.ch28;

public class Solution {

    public static int  strStr(String haystack, String needle) {
          if(needle == null || needle.length() == 0 ) {
              return 0;
          }

          if( needle.length() > haystack.length()) {
              return -1;
          }



          int len = needle.length();
          int result  = -1;
          for (int i = 0; (i+len) <= haystack.length();i++) {
              result =-1;
              String temp = haystack.substring(i,len+i);
              int first = 0,last = len - 1;
              while (first <= last) {
                  if(temp.charAt(first) == needle.charAt(first) && temp.charAt(last) == needle.charAt(last)) {
                      if(result == -1) {
                          result = i;
                      }
                      first++;
                      last--;
                      continue;
                  }
                  result = -1;
                  break;
              }
              if(result != -1) {
                  break;
              }



          }



          return  result;
    }


    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";

        System.out.println(strStr(haystack,needle));

    }

}
