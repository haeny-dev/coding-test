package co.kr.programmers.level0.lessons120851

class Solution {
    fun solution(my_string: String): Int = my_string.filter { it.isDigit() }.sumOf { it.digitToInt() }
}

fun main() {
    val solution = Solution()
    println("my_string: aAb1B2cC34oOp, result: ${solution.solution("aAb1B2cC34oOp")}")
    println("my_string: 1a2b3c4d123, result: ${solution.solution("1a2b3c4d123")}")
}