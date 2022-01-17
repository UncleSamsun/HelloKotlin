package chap03.section4.localReturn


fun main() {
    shortFunc(3) {
        println("First call: $it")
        return@shortFunc
    }
}

inline fun shortFunc(a: Int, noinline out: (Int) -> Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}