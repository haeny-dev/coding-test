package com.leetcode.easy.problem_374_GuessNumberHigherOrLower

class Solution(
    val picked: Int,
) {
    fun guessNumber(n: Int): Int {
        var left = 1
        var right = n

        while(left <= right) {
            val mid = left + (right - left)/2
            val result = guess(mid)

            when {
                result == 0 -> return mid
                result > 0 -> left = mid + 1
                else -> right = mid - 1
            }
        }
        return n
    }

    private fun guess(number: Int): Int =
        when {
            picked == number -> 0
            picked > number -> 1
            else -> -1
        }
}