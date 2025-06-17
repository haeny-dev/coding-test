package com.leetcode.easy.problem_151_ReverseWordsInAString

class Solution {
    fun reverseWords(s: String): String {
        return s.trim().split(" ").filterNot { it.isBlank() }.reversed().joinToString(" ")
    }
}

fun main() {
    println(Solution().reverseWords("the sky is blue"))
    println(Solution().reverseWords("  hello world  "))
    println(Solution().reverseWords("a good   example"))
}