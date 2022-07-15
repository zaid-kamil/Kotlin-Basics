class RevisionClass {

    val time = 1803
    var mood: String? = ""
    fun show() {
        println("Just a simple function")
    }
}

fun main() {
    val rc = RevisionClass()
    println(rc)
    println(rc.time)
    rc.mood = "angry"
    println(rc.mood)
    rc.show()
}