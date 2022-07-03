fun getLength(str: String?): Int? {
    return str?.length
}

fun main() {
    var name: String? = "Zaid"
    println(getLength(name))
    name = null
    println(getLength(name))
}