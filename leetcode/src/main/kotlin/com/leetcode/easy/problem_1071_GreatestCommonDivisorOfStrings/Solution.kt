package com.leetcode.easy.problem_1071_GreatestCommonDivisorOfStrings

class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        var token = listOf(str1, str2).minBy { it.length }
        var all = str1.split(token).all { it.isBlank() } && str2.split(token).all { it.isBlank() }

        while (!all) {
            token = token.substring(0..token.length - 2)

            all = if (token.isNotBlank()) {
                str1.split(token).all { it.isBlank() } && str2.split(token).all { it.isBlank() }
            } else true
        }

        return token
    }
}

fun main() {
    val solution = Solution()
    assert("ABC" == solution.gcdOfStrings("ABCABC", "ABC"))
    assert("AB" == solution.gcdOfStrings("ABABAB", "ABAB"))
    assert("" == solution.gcdOfStrings("LEET", "CODE"))
}