fun main() {
    /*
    use null to indicate that there's no value associated with the variable.
     */
    val myFavActor = null
    println(myFavActor)

    var afterNull: String? = "Abhishek"
    println(afterNull)
    afterNull = null
    println(afterNull)
    var num: Int? = 10
    println(num)
    num = null
    println(num)

//    Accessing property of nullable variable
    var nulVar: String? = "Abhishek kumar"
    println(nulVar?.length) // Use the ?. safe call operator
    println(nulVar!!.length) // Use the !! not-null assertion operator

//    Elvis operator
    // In Kotlin, the Elvis operator (?:) is used to provide
    // a default value when an expression evaluates to null

    var nullName: String? = "Abhishek"
    val l = nullName?.length ?: 1
    println(l)

}