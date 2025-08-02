package com.leetcode.easy.problem_933_NumberOfRecentCalls

class RecentCounter {
    val queue = ArrayDeque<Int>()

    fun ping(t: Int): Int {
        while (queue.isNotEmpty() && queue.first() < t - 3000) {
            queue.removeFirst()
        }

        queue.add(t)
        return queue.size
    }
}