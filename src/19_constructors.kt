//  Primary constructor
class Mobile(var brand: String, var model: String, var year: Int)

//  Secondary Constructor
class ConstructorOne(var name:String){
     var sum:String  = ""
    constructor(age: Short , name: String):this(name){
         sum = "$age + $name"
    }
}
/**
 * The primary purpose of the constructor is to specify how the objects of the class are created.
 * In other words, constructors initialize an object and make the object ready for use.
 * You did this when you instantiated the object.
 * The code inside the constructor executes when the object of the class is instantiated.
 * You can define a constructor with or without parameters.
 */
fun main() {
    val a1 = Mobile("Vivo", " t1x ", 2022)
    val a2 = Mobile("Apple", " 14 ", 2022)
    val a3 = Mobile("Oppo", " pad air 1 ", 2022)

    print(a1.year)
    print(a1.model)
    println(a1.brand)

    print(a2.year)
    print(a2.model)
    println(a2.brand)

    print(a3.year)
    print(a3.model)
    println(a3.brand)

    val obj1 = ConstructorOne(25,"Chunu")
    println(obj1.sum)



}