package co.kr.programmers.level0.lessons120809

class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer: IntArray = intArrayOf()
        return numbers.map { it * 2 }.toIntArray()
    }
}

fun main() {
    val solution = Solution()
    println("numbers: [1, 2, 3, 4, 5], answer: [${solution.solution(intArrayOf(1, 2, 3, 4, 5)).joinToString(",")}]")
}