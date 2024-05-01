fun main() {
    /*  Data types are divided into different groups:
    1. Numbers
    2. Characters
    3. Booleans
    4. Strings
    5. Arrays      */


    /* "Numbers are divided into two groups:

     1. Integer types store whole numbers (e.g., 123, -456) without decimals, including Byte, Short, Int, and Long.
     2. Floating point types represent numbers with decimals, including Float and Double."

     "If type is not specified, numeric variables default to Int for whole numbers and Double for floating point
     numbers."
     */

//    Integer Type (Byte) .  "Byte stores integers from -128 to 127, saving memory compared to Int when
//    values stay within this range."
    val myAge: Byte = 18
    println(myAge)
    println(Byte.MAX_VALUE)
    println(Byte.MIN_VALUE)

//    val myAge1: Byte = 150    // This will throw an error
//    println(myAge1)

//    Integer Type (Short) . The Short data type can store whole numbers from -32768 to 32767:
    val serialNumber: Short = 1250
    println(serialNumber)

//    Integer Type (Int) . The Int data type can store whole numbers from -2147483648 to 2147483647:
//    we can add underscores to divide the digits into blocks to make this number more readable:
    val number: Int = 1_23_456
    println(number)

//    Integer Type (Long) . The Long data type can store whole numbers
//    from -9223372036854775807 to 9223372036854775807.
    val bigNumber: Long = 9223372036854775806L
    println(bigNumber)


//    Double
    val fn1: Double = 13.33  // default Double
    println(fn1)

    val fn2: Float = 13.56f
    println(fn2)
    /*Use Double for most calculations due to its precision of about 15 digits,
    compared to Float's 6 or 7 digits. Remember to end Float values with an "F".*/

//Scientific Calculation

    val scn = 5e2  // WE CAN USE `e` AND `E` . HERE 5E2 = 5 X 10 POWER 2 , E = 10  , DOUBLE BY DEFAULT
    println(scn)

//    Boolean

    val yes: Boolean = true
    println(yes)

//    Character

    val firstAlpha: Char = 'a'
    println(firstAlpha)

//    String

    val name: String = "Abhishek"
    println(name)

}