package co.kr.programmers.level0.lessons120816

class Solution {
    fun solution(slice: Int, n: Int): Int = if (n % slice > 0) n / slice + 1 else n / slice
}

fun main() {
    val solution = Solution()
    println("slice: 7, n: 10, result: ${solution.solution(7, 10)}")
    println("slice: 4, n: 12, result: ${solution.solution(4, 12)}")
}