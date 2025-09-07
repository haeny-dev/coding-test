package com.leetcode.medium.problem_443_StringCompression

class Solution {
    fun compress(chars: CharArray): Int {
        var i = 0
        var j = 0

        while (i < chars.size) {
            var k = i
            while (k < chars.size && chars[i] == chars[k]) {
                k++
            }

            chars[j++] = chars[i]

            if (k-i > 1) {
                val count = (k-i).toString()
                for (s in count.indices) {
                    chars[j++] = count[s]
                }
            }

            i += (k-i)
        }

        return j
    }
}

fun main() {
    val solution = Solution()

    // Case1
    println(solution.compress(chars = charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')))
    // Case2
    println(solution.compress(chars = charArrayOf('a')))
    // Case3
    println(solution.compress(chars = charArrayOf('a','b','b','b','b','b','b','b','b','b','b','b','b')))
}