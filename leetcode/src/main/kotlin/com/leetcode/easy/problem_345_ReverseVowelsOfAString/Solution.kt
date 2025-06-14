package com.leetcode.easy.problem_345_ReverseVowelsOfAString

class Solution {
    fun reverseVowels(s: String): String {
        val vowels = mutableListOf<Char>()
        val indexs = mutableSetOf<Int>()
        s.forEachIndexed { index, c ->
            if (c in setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')) {
                vowels.add(c)
                indexs.add(index)
            }
        }

        val reverseVowels = vowels.reversed()
        var index = 0
        return s.mapIndexed { i, c ->
            if (i in indexs) {
                reverseVowels[index++]
            } else c
        }.joinToString("")
    }
}

fun main() {
    println(Solution().reverseVowels("IceCreAm"))
}