package co.kr.programmers.level0.lessons120813

class Solution {
    fun solution(n: Int) = (1..n).filter { it % 2 != 0 }
}

fun main() {
    val solution = Solution()
    println("n: 10, [${solution.solution(10).joinToString(",")}]")
}