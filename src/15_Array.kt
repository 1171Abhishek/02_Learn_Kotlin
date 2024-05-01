fun main() {
    val friendName = arrayOf("Ayush", "Pankaj", "Suraj", "Aditya")
    println(friendName[0])

    friendName[0] = "Abhishek"
    println(friendName[0])

    println(friendName.size)

    println("Abhishek" in friendName)

    for (i in friendName) {
        println(i)
    }
}