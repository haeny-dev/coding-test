package com.leetcode.medium.problem_1679_MaxNumberOfKSumPairs

class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        var operationNumber = 0

        var left = 0
        var right = nums.size -1

        nums.sort()

        while (left < right) {
            val sum = nums[left] + nums[right]

            when {
                sum > k -> right--
                sum < k -> left++
                else -> {
                    right--
                    left++
                    operationNumber++
                }
            }
        }

        return operationNumber
    }
}

fun main() {
    val solution = Solution()

    println(solution.maxOperations(nums = intArrayOf(1, 2, 3, 4), k = 5))
}