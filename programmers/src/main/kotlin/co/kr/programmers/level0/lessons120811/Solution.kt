package co.kr.programmers.level0.lessons120811

class Solution {
    fun solution(array: IntArray) = array.sorted()[array.size / 2]
}

fun main() {
    val solution = Solution()
    println("array: [1, 2, 7, 10, 17], answer: ${solution.solution(intArrayOf(1, 2, 7, 10, 17))}")
    println("array: [9, -1, 0], answer: ${solution.solution(intArrayOf(9, -1, 0))}")
}