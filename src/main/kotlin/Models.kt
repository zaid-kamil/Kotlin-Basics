data class UserV2(val fName: String, val lName: String, val age: Int)
data class Address(val street: String, val zipCode: ZipCode)
data class ZipCode(val prefix: String, val postfix: String)


fun main() {
    val user = UserV2("Bruce", "Banner", 40)
    val addr = Address("Andheri Street", ZipCode("00", "2999"))
    println("${user.fName} lives at ${addr.street}")
}