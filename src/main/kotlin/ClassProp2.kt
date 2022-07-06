class Doctor {
    var name: String = ""
        set(value) {
            field = "Dr. $value"
        }
    var speciality: String = ""
        get() {
            if (field.isNotEmpty()) return field
            else return "not special"
        }
}

fun main() {
    val d = Doctor()
    d.name = "Rangaswamy"
    d.speciality = "Dentist"
    println("name => ${d.name}")
    println("specialist => ${d.speciality}")
}