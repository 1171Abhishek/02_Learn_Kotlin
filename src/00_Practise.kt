import kotlin.math.sqrt

fun main() {
    println("Enter number")
    val userInputNumber : Int = readln().toInt()
    println(isPrime(userInputNumber))
}

fun isPrime(number: Int): Boolean {
    if ( number <= 1) {
        return false
    }
    for  (i in 2..sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return  false
        }
    }
    return true
}
