package co.kr.programmers.level0.lessons120831

class Solution {
    fun solution(n: Int): Int = (1..n).filter { it % 2 == 0 }.sum()
}

fun main() {
    val solution = Solution()
    println("n: 10, result: ${solution.solution(10)}")
    println("n: 4, result: ${solution.solution(4)}")
}