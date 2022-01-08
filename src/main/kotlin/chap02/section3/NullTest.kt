package chap02.section3

fun main() {
    var str1: String? = "null"
    var num: Int? = null

    println("str1: $str1, num: $num")

    println("str1: $str1 lenghth: ${str1?.length ?: -1}")
}