package co.kr.programmers.level2.lessons12939

class Solution {
    fun solution(s: String): String {
        val numbers = s.split(" ").map { it.toInt() }
        return "${numbers.minOf { it }} ${numbers.maxOf { it }}"
    }
}

fun main() {
    val solution = Solution()
    assert("1 4" == solution.solution("1 2 3 4"))
    assert("-4 -1" == solution.solution("-1 -2 -3 -4"))
    assert("-1 -1" == solution.solution("-1 -1"))
}