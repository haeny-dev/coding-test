package co.kr.programmers.level0.lessons120892

class Solution {
    fun solution(cipher: String, code: Int): String = cipher.filterIndexed { index, c -> (index + 1) % code == 0 }
}

fun main() {
    val solution = Solution()
    println("cipher: dfjardstddetckdaccccdegk, code: 4, result: ${solution.solution("dfjardstddetckdaccccdegk", 4)}")
}