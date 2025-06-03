package com.leetcode.easy.problem_1431_KidsWithTheGreatestNumberOfCandies

class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()
        return candies.map {
            max.minus(it) <= extraCandies
        }
    }
}

fun main() {
    val solution = Solution()
    assert(listOf(true, true, true, false, true) == solution.kidsWithCandies(
        candies = intArrayOf(2, 3, 5, 1, 3), extraCandies = 3
    ))
    assert(listOf(true, false, false, false, false) == solution.kidsWithCandies(
        candies = intArrayOf(4, 2, 1, 1, 2), extraCandies = 1
    ))
    assert(listOf(true, false, true) == solution.kidsWithCandies(
        candies = intArrayOf(12, 1, 12), extraCandies = 10
    ))
}