fun main() {
    val name: String = "Abhishek kumar"
    println(name)

//    String without assigning
    val name2: String
    name2 = "Pro"
    println(name2)

//    Accessing String element
    val name3 = "Abhishek"  // [0] is the first element. [1] is the second element, [2] is the third element, etc.
    println(name3[0])
    println(name3.length)
    println(name3.uppercase())
    println(name3.lowercase())

//    Compare Strings
    val str1 = "Abhi"
    val str2 = "Abhi"
    println(str1.compareTo(str2)) // if 0 it means it is equal
    println(str1 == str2)

//    Index of
    val str3 = "Hello i am Abhishek and i am Abhishek good"
    println(str3.indexOf("Abhishek"))

//    String Templates and Concatenation
    val str4 = "Abhi"
    val str5 = "shek"
    println(str4 + str5)
    println("$str4$str5")

    val name1 = "Abhishek"
    for (x in name1) {
        println(x)
    }

    val s = "Abhishek" + 1171
    println(s)
}