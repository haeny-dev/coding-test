package com.hackerrank.problem_MiniMaxSum

import javax.swing.text.html.HTML.Tag.P
import kotlin.math.max
import kotlin.math.min

fun miniMaxSum(arr: Array<Int>): Unit {
    var sum: Long = 0L
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE

    for (i in arr.indices) {
        sum += arr[i]
        max = maxOf(max, arr[i])
        min = minOf(min, arr[i])
    }

    println("${sum - max} ${sum - min}")
}

fun main(args: Array<String>) {
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    miniMaxSum(arr)
}