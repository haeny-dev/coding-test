package co.kr.programmers.level0.lessons120818

class Solution {
    fun solution(price: Int): Int =
        when {
            price >= 100000 && price < 300000 -> price.times(0.95).toInt()
            price >= 300000 && price < 500000 -> price.times(0.9).toInt()
            price >= 500000 -> price.times(0.8).toInt()
            else -> price
        }
}

fun main() {
    val solution = Solution()
    println("price: 150,000, result: ${solution.solution(150000)}")
    println("price: 580,000, result: ${solution.solution(580000)}")
}