package com.leetcode.easy.problem_605_CanPlaceFlowers

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var intArr = flowerbed
        var plantCount = 0
        var i = 0

        if (intArr.size == 1 && intArr[0] == 0 && n <= 1) return true

        while (i < intArr.size) {
            when {
                i == 0 -> {
                    if (intArr[i] == 0 && intArr[i + 1] == 0) {
                        intArr[i] = 1
                        plantCount++
                    }
                }
                i == intArr.size - 1 -> {
                    if (intArr[i] == 0 && intArr[i - 1] == 0) {
                        intArr[i] = 1
                        plantCount++
                    }
                }
                else -> {
                    if (intArr[i] == 0 && intArr[i - 1] == 0 && intArr[i + 1] == 0) {
                        intArr[i] = 1
                        plantCount++
                    }
                }
            }
            i++
        }

        return plantCount >= n
    }
}

fun main() {
    val solution = Solution()
    println(solution.canPlaceFlowers(
        flowerbed = intArrayOf(0),
        n = 0
    ))
}