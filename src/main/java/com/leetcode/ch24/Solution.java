package com.leetcode.ch24;


/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。



 示例:

 给定 1->2->3->4, 你应该返回 2->1->4->3.
 */
public class Solution {

    public  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public  ListNode swapPairs(ListNode head) {

        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode result = dump;

        while (head!= null && head.next != null){
           dump.next = head.next;
            head.next = head.next.next;
            dump.next.next = head;
            head = head.next;
            dump = dump.next.next;
        }

        return result.next;
    }




}
