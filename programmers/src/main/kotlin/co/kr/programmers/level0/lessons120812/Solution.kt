package co.kr.programmers.level0.lessons120812

class Solution {
    //
    fun solution(array: IntArray): Int {
        val map = hashMapOf<Int, Int>()
        array.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        val max = map.maxByOrNull { it.value }
        return if (map.values.filter { it == max!!.value }.size > 1) {
            -1
        } else {
            max!!.key
        }
    }

    fun otherSolution(array: IntArray): Int =
        array.groupBy { it }
            .map { it.key to it.value.size }
            .sortedByDescending { it.second }
            .let {
                if ( it.size > 1 && it[0].second == it[1].second) {
                    -1
                } else {
                    it.first().first
                }
            }
}

fun main() {
    val solution = Solution()
    println("array: [1, 2, 3, 3, 3, 4], answer: ${solution.solution(intArrayOf(1, 2, 3, 3, 3, 4))}")
    println("array: [1, 2, 3, 3, 3, 4], answer: ${solution.otherSolution(intArrayOf(1, 2, 3, 3, 3, 4))}")
}