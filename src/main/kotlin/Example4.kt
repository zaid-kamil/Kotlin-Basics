import kotlin.math.pow

fun areaCircle(radius: Double?): Double {
    return 3.14 * radius!!.pow(2)
}

fun main() {
    val ac = areaCircle(8.3)
    println(ac)
    print(areaCircle(null))
}