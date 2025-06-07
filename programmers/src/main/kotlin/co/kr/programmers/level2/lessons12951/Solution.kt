package co.kr.programmers.level2.lessons12951

class Solution {
    fun solution(s: String): String {
        return s.lowercase().split(" ").joinToString(" ") {
            it.toCharArray().mapIndexed { index, c ->
                if (index == 0) {
                    c.uppercase()
                } else c
            }.joinToString("")
        }
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution("3people unFollowed me"))
    assert("For The Last Week" == solution.solution("for the last week"))
}