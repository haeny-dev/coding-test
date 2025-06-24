package com.hackerrank.problem_PlusMinus

import java.math.RoundingMode
import java.text.DecimalFormat

fun plusMinus(arr: Array<Int>): Unit {
    val sums = DoubleArray(3) { 0.0 }

    for (i in arr.indices) {
        when {
            arr[i] > 0 -> sums[0]++
            arr[i] < 0 -> sums[1]++
            arr[i] == 0 -> sums[2]++
        }
    }

    val df = DecimalFormat("#.######")
    df.roundingMode = RoundingMode.HALF_UP

    println(df.format(sums[0]/arr.size))
    println(df.format(sums[1]/arr.size))
    println(df.format(sums[2]/arr.size))
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}