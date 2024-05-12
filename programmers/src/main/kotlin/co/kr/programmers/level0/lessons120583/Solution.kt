package co.kr.programmers.level0.lessons120583

class Solution {
    fun solution(array: IntArray, n: Int): Int = array.groupBy { it }[n]?.size ?: 0
    fun otherSolution(array: IntArray, n: Int): Int = array.count { it == n }
}

fun main() {
    val solution = Solution()
    println("array: [1, 1, 2, 3, 4, 5], n: 1, result: ${solution.solution(intArrayOf(1, 1, 2, 3, 4, 5), 1)}")
    println("array: [0, 2, 3, 4], n: 1, result: ${solution.solution(intArrayOf(0, 2, 3, 4), 1)}")
}