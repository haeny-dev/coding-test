package co.kr.programmers.level0.lessons120802

class Solution {
    fun solution(num1: Int, num2: Int) = num1 + num2
}

fun main() {
    val solution = Solution()
    assert(solution.solution(2, 3) == 5)
    println("num1: 2, num2: 3, result: ${solution.solution(2, 3)}")
    println("num1: 100, num2: 2, result: ${solution.solution(100, 2)}")
}