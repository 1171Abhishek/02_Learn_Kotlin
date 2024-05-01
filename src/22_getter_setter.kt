class Person {
    var name: String = "unknown"
        get() {
            println("Getting the name")
            return field
        }
        set(value) {
            println("Setting the name")
            field = value
        }
}


fun main() {
    var person = Person()
    println(person.name)
    person.name = "Abhishek"
    println(person.name)
}