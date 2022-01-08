package chap02.section3

fun main() {
    val a: Int = 127 //-128 ~ 127 사이는 캐시에 들어가기 때문에 주소가 같다.
    val b = a

    println(a === b)
    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d)
    println(c === d)
    println(c === e)

}