fun rrr(x:Double):Double {
    val value = x // Your number

    // Convert the number to a string
    val stringValue = value.toString()

    // Split the string into parts separated by the decimal point
    val parts = stringValue.split(".")

    // Take the first part (before the decimal point)
    val integerPart = parts[0]

    // Take the second part (after the decimal point) and keep only the first two digits
    val decimalPart = if (parts.size > 1) parts[1].take(2) else "00"

    // Concatenate the integer part and the first two digits of the decimal part
    val formattedValue = "$integerPart.$decimalPart"

//    println(formattedValue) // Print the formatted value
    return formattedValue.toDouble()
}

fun main(){
    println(rrr(100.98))
}