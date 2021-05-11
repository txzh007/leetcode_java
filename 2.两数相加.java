/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode list = head;
        int tmp = 0;
        while (true) {
            ListNode node = new ListNode();
            if (l1 != null && l2 != null) {
                tmp = tmp + l1.val + l2.val;
                node.val = tmp % 10;
                tmp = tmp / 10;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null && l2 == null) {
                tmp = tmp + l1.val;
                node.val = tmp % 10;
                tmp = tmp / 10;
                l1 = l1.next;
            } else if (l1 == null && l2 != null) {
                tmp = tmp + l2.val;
                node.val = tmp % 10;
                tmp = tmp / 10;
                l2 = l2.next;
            } else {
                // 当左右链表都为空 有余数时
                if (tmp != 0) {
                    node.val = tmp;
                    list.next = node;
                }
                break;
            }
            list.next = node;
            list = list.next;

        }
        return head.next;
    }

}
// @lc code=end
