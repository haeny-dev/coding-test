package co.kr.programmers.level0.lessons120824

class Solution {
    fun solution(num_list: IntArray): IntArray = num_list.groupBy { it % 2 == 0 }
        .let { intArrayOf(it.getOrDefault(true, emptyList()).size, it.getOrDefault(false, emptyList()).size) }
}

fun main() {
    val solution = Solution()
    println("num_list: [1, 2, 3, 4, 5], result: [${solution.solution(intArrayOf(1, 2, 3, 4, 5)).joinToString(",")}]")
    println("num_list: [1, 3, 5, 7], result: [${solution.solution(intArrayOf(1, 3, 5, 7)).joinToString(",")}]")
}