// You have to create a class Employee
// use a constructor to set the name and age of employee
// create a property da = 0
// create a property hra = 0
// create a property basic = 10000
// create a property totalSalary
// add a custom getter for totalSalary so that it can add da,hra,basic

class Employee(val name: String, val age: Int) {
    var da = 0
    var hra = 0
    var basic = 10000
    val totalSalary
        get() = da + hra + basic
}

fun main() {
    val e = Employee("Rohan", 23)
    e.hra = 1200
    e.da = 1000
    e.basic = 23000

    println("${e.name} has a total salary of ${e.totalSalary}")
}