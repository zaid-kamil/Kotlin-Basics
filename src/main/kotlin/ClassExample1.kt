class Square(val l: Int, val b: Int = 0) {

    // perimeter fun
    fun perimeter() = 2 * (l + b)

    // area fun
    fun area() = l * b
}

fun main() {
    val s1 = Square(10, 10)
    val s2 = Square(30, 30)
    println("Square length ${s1.l}")
    println("Square length ${s1.b}")
    println("perimeter of Square : ${s1.perimeter()}")
    println("area of Square : ${s1.area()}")
}