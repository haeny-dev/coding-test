package co.kr.programmers.level0.lessons120807

class Solution {
    fun solution(num1: Int, num2: Int) = if (num1 == num2) 1 else -1
}

fun main() {
    val solution = Solution()
    println("num1: 2, num2: 3, result: ${solution.solution(2, 3)}")
    println("num1: 11, num2: 11, result: ${solution.solution(11, 11)}")
    println("num1: 7, num2: 99, result: ${solution.solution(7, 99)}")
}