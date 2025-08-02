package com.leetcode.easy.problem_1207_UniqueNumberOfOccurrences

class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val occurrences = mutableMapOf<Int, Int>()

        arr.forEach {
            occurrences[it] = occurrences.getOrDefault(it, 0) + 1
        }

        return occurrences.keys.size == occurrences.values.toSet().size
    }
}

fun main() {
    val solution = Solution()

    println(solution.uniqueOccurrences(intArrayOf(1, 2, 2, 1, 1, 3)))
}