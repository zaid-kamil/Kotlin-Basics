// extension method
fun String.wordCounter(): Int {
    return this.split(" ").size
}

fun main() {
    val msg = "All is one, one is All"
    val out = msg.wordCounter()
    print("length of msg is $out")
}