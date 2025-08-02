package com.leetcode.easy.problem_724_FindPivotIndex

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var left = 0
        var right = nums.sum()
        var pivotIndex = -1

        for (i in nums.indices) {
            if (i == 0) {
                right -= nums[i]
            } else if (i == nums.lastIndex) {
                left += nums[i - 1]
                right = 0
            } else {
                left += nums[i - 1]
                right -= nums[i]
            }

            if (left == right) {
                pivotIndex = i
                break
            }
        }

        return pivotIndex
    }
}

fun main() {
    val solution = Solution()
    println(solution.pivotIndex(nums = intArrayOf(1, 7, 3, 6, 5, 6)))
    println(solution.pivotIndex(nums = intArrayOf(1, 2, 3)))
    println(solution.pivotIndex(nums = intArrayOf(2, 1, -1)))
}