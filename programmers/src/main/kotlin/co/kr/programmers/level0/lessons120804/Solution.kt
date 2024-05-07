package co.kr.programmers.level0.lessons120804

class Solution {
    fun solution(num1: Int, num2: Int) = num1 * num2
}

fun main() {
    val solution = Solution()
    println("num1: 3, num2: 4, result: ${solution.solution(3, 4)}")
    println("num1: 27, num2: 19, result: ${solution.solution(27, 19)}")
}