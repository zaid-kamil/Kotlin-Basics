class User(var firstName: String?, var lastName: String?) {
    fun show() {
        println("$firstName $lastName")
    }
}

fun main() {
    val usr = User("Bruce", "Wayne")
    val i = 10
    val name = "Rajesh"
    usr.show()

}