fun main() {
    val number = 2
    val numberResult = when (number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "Other"
    }
    println(numberResult)

    println("Enter number between 1 and 5")
    val inoutNumber: Int = readln().toInt()
    when (inoutNumber) {
        1 -> println("One")
        2 -> println("two")
        3 -> println("three")
        4 -> println("four")
        else -> println("five")
    }
}
