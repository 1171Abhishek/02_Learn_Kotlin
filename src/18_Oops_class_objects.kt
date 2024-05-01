class Car {
    // Properties
    var brand = ""
    var model = ""
    var year = 0
}

fun main() {
    // Object c1 of class Car
    val c1 = Car()

//    Access property of Car
    c1.year = 2024
    c1.model = "241X"
    c1.brand = "Abhishek"


    println(c1.year)
    println(c1.model)
    println(c1.brand)
}