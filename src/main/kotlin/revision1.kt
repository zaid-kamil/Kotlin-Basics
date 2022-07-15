fun multi(one: Int, two: Int): Int {
    return one * two
}

fun display(name: String?) {
    println(name)
}

fun add(v1: Int, v2: Int) = v1 + v2

fun main() {
    val ans = multi(23, 32)
    println(ans)
    var ans2 = multi(22, 11)
    ans2 += 5
    println(ans2)
    println(multi(78, 89))
    display(null)
    display("Raja")
}