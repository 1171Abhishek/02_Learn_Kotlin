fun main() {

    val n1 = 10
    val n2 = 23

    if (n1 < n2) {
        println("yes")
    } else if (n1 == n2) {
        println("no")
    } else {
        println("I don't know")
    }


//    If else expression
    val name = "Abhishek"
    val output = if (name is String) {
        "Yes $name is String"
    } else {
        "no $name is not string"
    }
    println(output)

//    In one line
    val out = if (output is String) "ok" else "no"
    println(out)


}