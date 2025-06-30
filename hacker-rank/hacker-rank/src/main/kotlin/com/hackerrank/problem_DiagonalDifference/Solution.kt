package com.hackerrank.problem_DiagonalDifference

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var upDownSum = 0
    var downUpSum = 0

    for (i in arr.indices) {
        upDownSum += arr[i][i]
        downUpSum += arr[i][arr.lastIndex - i]
    }

    return abs(upDownSum - downUpSum)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
