/*
Visibility modifiers :
public: The declaration is visible everywhere.
internal: The declaration is visible within the same module . (a module is a set of Kotlin files compiled together).
protected: The declaration is visible in the same class and its subclasses (inherited classes).
private: The declaration is visible only within the same file (file-level private) or the same class (class-level private). This is the most restrictive visibility modifier.
*/



open class Vclass {
    val number1 = 1
    internal val number2 = 1_0
    protected val number3 = 1_00
    private val number4 = 1_000
    fun plnNumber4() {
        println(number4)
    }
}

class Vclass2 : Vclass() {
    fun accessNumber3() {
        println(number3)

    }
}

// Private function
private fun pFub() {
    println("Hello I am a private function")
}

fun main() {
    val obj1 = Vclass()
    val obj2 = Vclass2()
    println(obj1.number1)
    println(obj1.number2)
    obj2.accessNumber3()
    obj1.plnNumber4()
    pFub()

}