public fun si(principal: Float, rate: Float = 3.5f, time: Int = 1): Float {
    return (principal * rate * time) / 100
}

fun main() {
    val ans1 = si(10000f)
    val ans2 = si(23900f, 1.23f)
    val ans3 = si(23900f, 1.23f, 3)
    val ans4 = si(21000f, rate = 5f)
    val ans5 = si(21000f, time = 5)

    println(ans1)
    println(ans2)
    println(ans3)
    println(ans4)
    println(ans5)
}