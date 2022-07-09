fun showContent(items: List<String>) {
    for (item in items) {
        println("I have got $item")
    }

}

fun showNumbers() {
    var a = 0
    println("Loop 1")
    for (i in 1..10) {
        print("$i ")
    }
    println("Loop 2")
    for (i in 1 until 5) {
        print("$i ")
    }
    println("Loop 3")
    for (i in 5 downTo -5) {
        print("$i ")
    }
    println("Loop 4")
    for (i in 1..100 step 5) {
        print("$i ")
    }
}

fun main() {
    val fruits = arrayListOf("apple", "banana", "cherry")
    showContent(fruits)
    showNumbers()
}