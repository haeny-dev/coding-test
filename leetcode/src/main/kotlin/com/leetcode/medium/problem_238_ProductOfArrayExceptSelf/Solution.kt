package com.leetcode.medium.problem_238_ProductOfArrayExceptSelf

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val prefix = IntArray(nums.size) { 1 }
        val suffix = IntArray(nums.size) { 1 }

        for (i in 1 until nums.size) {
            prefix[i] = prefix[i - 1] * nums[i - 1]
        }

        for (i in nums.size - 2 downTo 0) {
            suffix[i] = suffix[i + 1] * nums[i + 1]
        }

        val result = IntArray(nums.size)
        for (i in nums.indices) {
            result[i] = prefix[i] * suffix[i]
        }

        return result
    }
}

fun main() {
    println(Solution().productExceptSelf(intArrayOf(1, 2, 3, 4)).joinToString(","))
}