package co.kr.programmers.level0.lessons120817

class Solution {
    fun solution(numbers: IntArray): Double = numbers.sum().toDouble() / numbers.size
    fun otherSolution(numbers: IntArray) = numbers.average()
}

fun main() {
    val solution = Solution()
    println("numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], answer: ${solution.solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))}")
}