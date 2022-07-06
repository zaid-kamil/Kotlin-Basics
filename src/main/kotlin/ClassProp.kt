class UserV3 {
    var firstName: String? = "Rajesh"
    var lastName = "Shukla"
    val age = 19
}

fun main() {
    val u1 = UserV3()
    u1.firstName = "Vijay"
    u1.lastName = "Sharma"
    println("${u1.firstName} ${u1.lastName} is ${u1.age} yrs old")
}