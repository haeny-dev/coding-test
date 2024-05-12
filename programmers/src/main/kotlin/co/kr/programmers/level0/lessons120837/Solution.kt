package co.kr.programmers.level0.lessons120837

class Solution {
    fun solution(hp: Int): Int = hp/5 + hp%5/3 + hp%5%3
}

fun main() {
    val solution = Solution()
    println("hp: 23, result: ${solution.solution(23)}")
    println("hp: 24, result: ${solution.solution(24)}")
    println("hp: 999, result: ${solution.solution(999)}")
}