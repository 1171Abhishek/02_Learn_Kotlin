open class C1 {
    var name = "Abhishek"
}

class C2 : C1() {
    fun printName() {
        println(name)
    }
}

fun main() {
    val a1 = C2()
    a1.printName()

}