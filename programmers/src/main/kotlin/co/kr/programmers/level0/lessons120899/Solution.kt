package co.kr.programmers.level0.lessons120899

class Solution {
    fun solution(array: IntArray): IntArray {
        var max = 0
        var index = 0
        array.forEachIndexed { i, v ->
            if (v > max) {
                max = v
                index = i
            }
        }
        return intArrayOf(max, index)
    }
}
