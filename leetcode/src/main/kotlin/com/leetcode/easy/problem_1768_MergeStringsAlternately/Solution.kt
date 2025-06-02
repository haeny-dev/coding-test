package com.leetcode.easy.problem_1768_MergeStringsAlternately

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var merged = ""
        val longerWord = listOf(word1, word2).maxBy { it.length }

        for (i in longerWord.indices) {
            merged += word1.getOrNull(i) ?: ""
            merged += word2.getOrNull(i) ?: ""
        }

        return merged
    }
}

fun main() {
    val solution = Solution()
    assert("apbqcr" == solution.mergeAlternately("abc", "pqr"))
    assert("apbqrs" == solution.mergeAlternately("ab", "pqrs"))
    assert("apbqcd" == solution.mergeAlternately("abcd", "pq"))
}