package com.leetcode.ch19;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

 示例：

 给定一个链表: 1->2->3->4->5, 和 n = 2.

 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 */
public class Solution {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if(size == n) {
            return  head = head.next;
        }


        temp = head;
        for (int i =1; i < size - n;i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return  head;

    }




}
