// string interpolation


fun main() {
    val fruit = "Apple"
    val qty = 10
    val price = 230.50

    println("I purchased $fruit")
    println("I purchased $qty kg $fruit for $price")
    println("It costed my ${price / qty} per Kg")
    println("$fruit contains ${fruit.length} chars")
}