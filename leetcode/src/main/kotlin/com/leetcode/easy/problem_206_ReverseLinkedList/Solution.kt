package com.leetcode.easy.problem_206_ReverseLinkedList

class Solution {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun reverseList(head: ListNode?): ListNode? {
        var curr: ListNode? = head
        var prev: ListNode? = null

        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }

        return prev
    }
}