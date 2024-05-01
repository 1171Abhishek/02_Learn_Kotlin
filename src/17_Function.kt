fun main() {
//    named arguments
    println(greetMyName(100, "Abhishek"))
    3 add 52

    defArgFun(age = 10)

    println(square(10))

    println(7 time 5)
}

//Parameters
fun greetMyName(i: Int, name: String): String {
    return ("Hello this is my first function $i and $name")
}

// default arguments
fun defArgFun(a: String = "Abhishek", age: Int = 18) {
    println("$a and age is $age")
}

//single expression function
fun square(x: Int): Int = x * x

//infix function
infix fun Int.add(other: Int) {
    println(this + other)
}

infix fun Int.time(x: Int): Int {
    return x * this
}