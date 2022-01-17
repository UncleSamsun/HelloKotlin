package chap03.section4

fun main() {
    shortFunc(3) { println("First call: $it")}
    shortFunc(5) { println("First call: $it")}
}

inline fun shortFunc(a: Int, noinline out: (Int) -> Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")

}