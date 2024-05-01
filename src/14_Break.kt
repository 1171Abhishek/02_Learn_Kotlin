fun main() {
//    Break
    var number = 1
    while (number < 21) {
        println(number)
        number++
        if (number == 18) {
            break
        }
    }
//    Continue
    var number1 = 1
    while (number1 <= 10) {
        if (number1 == 5) {
            number1++
            continue
        }
        println(number1)
        number1++


    }


}