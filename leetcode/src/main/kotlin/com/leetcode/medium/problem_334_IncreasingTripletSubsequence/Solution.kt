package com.leetcode.medium.problem_334_IncreasingTripletSubsequence

class Solution {
    fun increasingTriplet(nums: IntArray): Boolean {
        var iNumber = Int.MAX_VALUE
        var jNumber = Int.MAX_VALUE

        nums.forEach {
            when {
                it <= iNumber -> iNumber = it
                it <= jNumber -> jNumber = it
                else -> return true
            }
        }

        return false
    }
}

fun main() {
    val solution = Solution()

    // Case1
    println(solution.increasingTriplet(nums = intArrayOf(1, 2, 3, 4, 5)))
    // Case2
    println(solution.increasingTriplet(nums = intArrayOf(5, 4, 3, 2, 1)))
    // Case3
    println(solution.increasingTriplet(nums = intArrayOf(2, 1, 5, 0, 4, 6)))
}