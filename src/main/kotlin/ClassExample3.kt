class Person(var fname: String, var lname: String) {
    var fullName: String
        get() = "$fname $lname"
        set(value) {
            fname = value.split(" ")[0]
            lname = value.split(" ")[1]
        }
}

fun main() {
    val p = Person("Raju", "Singh")
    println("Hello ${p.fullName}")
    p.fullName = "Rajesh Singh"
    println("Hello ${p.fullName}")
}