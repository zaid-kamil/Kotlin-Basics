class Cube(var size: Int) {
    fun area() = size * 6
}

class PersonV2(var fname: String, var lname: String) {
    override fun toString() = fname + lname
}

fun main() {
    val c1 = Cube(5)
    println(c1.area())
    val pe = PersonV2("ravi", "prakash")
    println(pe)
}