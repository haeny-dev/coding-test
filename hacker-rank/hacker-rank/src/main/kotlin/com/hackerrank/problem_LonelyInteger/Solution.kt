package com.hackerrank.problem_LonelyInteger

fun lonelyinteger(a: Array<Int>): Int {
    val countMap = mutableMapOf<Int, Int>()

    a.forEach {
        countMap[it] = countMap.getOrDefault(it, 0) + 1
    }

    return countMap.entries.first { it.value == 1 }.key
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = lonelyinteger(a)

    println(result)
}