package co.kr.programmers.level0.lessons120806

class Solution {
    fun solution(num1: Int, num2: Int) = ((num1.toDouble()/num2.toDouble())*1000).toInt()
    fun otherSolution(num1: Int, num2: Int) = num1 * 1000 / num2
}

fun main() {
    val solution = Solution()
    println("num1: 3, num2: 2, result: ${solution.solution(3, 2)}")
    println("num1: 7, num2: 3, result: ${solution.solution(7, 3)}")
    println("num1: 1, num2: 16, result: ${solution.solution(1, 16)}")
}