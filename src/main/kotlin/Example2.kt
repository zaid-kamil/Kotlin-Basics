import kotlin.math.pow

fun pytha(per: Float = 5f, base: Float = 10f): Float {
    return (per.pow(2) + base.pow(2)).pow(.5f)
}


fun main() {
    println(pytha(3.0f, 4.4f))
    println(pytha())
    println(pytha(9f))
    println(pytha(base = 5f))
}