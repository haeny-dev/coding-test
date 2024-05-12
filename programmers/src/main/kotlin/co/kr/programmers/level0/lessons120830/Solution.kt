package co.kr.programmers.level0.lessons120830

class Solution {
    fun solution(n: Int, k: Int): Int = n * 12000 + (k - n/10) * 2000
}

fun main() {
    val solution = Solution()
    println("n: 10, k: 3, result: ${solution.solution(10, 3)}")
    println("n: 64, k: 6, result: ${solution.solution(64, 6)}")
}