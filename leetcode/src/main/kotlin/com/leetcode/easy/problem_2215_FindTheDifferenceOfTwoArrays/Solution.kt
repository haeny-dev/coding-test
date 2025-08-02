package com.leetcode.easy.problem_2215_FindTheDifferenceOfTwoArrays

class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val nums1Set = nums1.toMutableSet()
        val nums2Set = nums2.toMutableSet()
        val answer0 = mutableListOf<Int>()

        nums1Set.forEach {
            if (nums2Set.contains(it)) {
                nums2Set.remove(it)
            } else {
                answer0.add(it)
            }
        }

        return listOf(answer0, nums2Set.toList())
    }
}

fun main() {
    val solution = Solution()

    println(solution.findDifference(intArrayOf(1, 2, 3), intArrayOf(2, 4, 6)))
}