class Student {
    lateinit var name: String
    lateinit var klass: String
    lateinit var rollNo: String
    lateinit var college: String

    fun setup(n: String, k: String, r: String, c: String) {
        name = n
        klass = k
        rollNo = r
        college = c
    }

    fun show() {
        println(name)
        println(klass)
        println(rollNo)
        println(college)
    }
}

fun main() {
    val s = Student()
    s.setup("Alexa", "5th", "219301", "SVM")
    s.show()
}