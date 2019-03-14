package com.leetcode.ch206;


public class Solution {

      public static class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }

    public  ListNode reverseList(ListNode head) {

        ListNode result = null;


        while (head != null){
            ListNode temp = head.next;
            head.next = result;
            result = head;
            head = temp;
        }

        return result;
    }


}
