package com.leetcode.ch206;

/**
 * 反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL
 */
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
