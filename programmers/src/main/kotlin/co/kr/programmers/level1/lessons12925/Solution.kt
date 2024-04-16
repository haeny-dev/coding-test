package co.kr.programmers.level1.lessons12925

class Solution {
    fun solution(s: String): Int {
        return s.toInt()
    }
}

fun main() {
    assert(Solution().solution("1234") == 1234)
    assert(Solution().solution("-1234") == -1234)
}