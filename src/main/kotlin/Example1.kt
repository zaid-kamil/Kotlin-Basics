public fun sum(a: Int, b: Int): Int {
    return a + b
}

// waf to multiply 3 values
fun multiply3(a: Int, b: Int, c: Int) = a * b * c

fun main() {
    println(sum(10, 23))

    println(sum(23, 45))

    println(sum(23, 23))

    println(multiply3(3, 3, 4))
}