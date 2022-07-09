/*
* if-else
* if-else if-else
* when
* */

fun tempToWord(temperature: Float): String {
    return when {
        temperature > 35 -> "Very Hot"
        temperature > 25 -> "Hot"
        temperature > 15 -> "Normal"
        temperature > 7 -> "Cold"
        temperature > -4 -> "very cool"
        else -> "invalid"
    }
}

fun getLevel(value: Int): String {
    return when (value) {
        5 -> "Boss level"
        4 -> "Mid Boss Level"
        3 -> "Bonus Level"
        2 -> "Starting area"
        1 -> "Tutorial Level"
        else -> "Invalid Level"
    }
}

fun main() {
    println(tempToWord(23.3f))
    println(tempToWord(33.1f))
    println(tempToWord(3.5f))
    println(getLevel(1))
    println(getLevel(2))
    println(getLevel(3))
    println(getLevel(3))
    println(getLevel(4))
    println(getLevel(5))
}