package co.kr.programmers.level0.lessons120814

class Solution {
    fun solution(n: Int): Int = if (n % 7 > 0) n / 7 + 1 else n / 7
}

fun main() {
    val solution = Solution()
    println("n: 7, result: ${solution.solution(7)}")
    println("n: 1, result: ${solution.solution(1)}")
    println("n: 15, result: ${solution.solution(15)}")
}