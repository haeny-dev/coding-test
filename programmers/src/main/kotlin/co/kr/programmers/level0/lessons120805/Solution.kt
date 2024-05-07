package co.kr.programmers.level0.lessons120805

class Solution {
    fun solution(num1: Int, num2: Int) = num1/num2
}

fun main() {
    val solution = Solution()
    println("num1: 10, num2: 5, result: ${solution.solution(10, 5)}")
    println("num1: 7, num2: 2, result: ${solution.solution(7, 2)}")
}