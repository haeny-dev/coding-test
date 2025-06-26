package com.hackerrank.problem_TimeConversion

import java.text.SimpleDateFormat
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun timeConversion(s: String): String {
    var hh = s.substring(0..1)
    val mm = s.substring(3..4)
    val ss = s.substring(6..7)
    val a = s.substring(8..9)

    if (a == "PM") {
        if (hh != "12") {
            hh = (hh.toInt() + 12).toString()
        }
    } else if (a == "AM") {
        if (hh == "12") {
            hh = "00"
        }
    }

    return "$hh:$mm:$ss"
}

fun main(args: Array<String>) {
    val s = readLine()!!
    println(timeConversion(s))
}