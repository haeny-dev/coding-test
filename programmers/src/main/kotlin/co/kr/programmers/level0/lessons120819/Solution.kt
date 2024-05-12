package co.kr.programmers.level0.lessons120819

class Solution {
    fun solution(money: Int): IntArray = intArrayOf(money/5500, money%5500)
}

fun main() {
    val solution = Solution()
    println("money: 5500, result: [${solution.solution(5500).joinToString(",")}]")
    println("money: 15000, result: [${solution.solution(15000).joinToString(",")}]")
}