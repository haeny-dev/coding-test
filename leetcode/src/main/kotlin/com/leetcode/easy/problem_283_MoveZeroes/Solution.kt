package com.leetcode.easy.problem_283_MoveZeroes

class Solution {
    fun moveZeroes(nums: IntArray): IntArray {
//        if (nums.size == 1) return nums
//
//        for (i in 0 until nums.lastIndex) {
//            if (nums[i] != 0) continue
//
//            for (j in i + 1 .. nums.lastIndex) {
//                if (nums[j] != 0) {
//                    nums[i] = nums[j]
//                    nums[j] = 0
//                    break
//                }
//            }
//        }
//
//        return nums

        var index = 0
        nums.forEach { if (it != 0) nums[index++] = it }
        while(index < nums.size) nums[index++] = 0

        return nums
    }
}

fun main() {
    println(Solution().moveZeroes(intArrayOf(0, 1, 0, 3, 12)).joinToString(","))
}