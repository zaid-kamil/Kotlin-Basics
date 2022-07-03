// getter and setter

class Rect(val l: Int, val b: Int = 0) {
    val perimeter get() = 2 * (l + b)
    val area get() = l * b
}

fun main() {
    val s1 = Rect(10, 10)
    println("Length: ${s1.l}")
    println("Breadth: ${s1.l}")
    println("Perimeter: ${s1.perimeter}")
    println("Perimeter: ${s1.area}")
}