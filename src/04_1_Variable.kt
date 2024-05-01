fun main() {
    /*
    Sometimes, you need to use a variable that should not be modified during the program execution.
    Such variables are known as constants, or val variables
     */

//    var Variable
    var age = 12
    println(age)


//    val Variable
    /* Val variables and mutability */
    /* It is important to note that val is not a synonym of immutable */
    val name = "Abhishek"
    println(name)

    /*
    It is always possible to change the internal state of a val variable: while it is prohibited to reassign the
    variable,its content can be modified in some other ways. we changed not the variable itself but the list it
    represents.
     */
    /*
     myFrndName is declared as a val, which means it cannot be reassigned,
     its internal state can be changed. Specifically it's possible to modify the
      content of the list myFrndName represents without reassigning the variable itself.
     */
    val myFrndName = mutableListOf("Abhishek", "Ayush", "Rohan", "Suraj")
    println(myFrndName)
    myFrndName.add("Pankaj")
    println(myFrndName)
    println(myFrndName[0])


    val one = "1"
    val two = 1


    println(one + two)

//    Normal
    println("Ten " + two)

//    String Concatenation
    println("Ten $two")

    println(NAME_FOR_CONST)
}

/*
a const modifier, which is used before the val keyword to declare a compile-time constant. The value of a const
variable is known at compile time and won't be changed at runtime:
There are some restrictions on when the const modifier can be applied. First, it can only be used with a String
 or a primitive type variable
 const variables need to be declared on top level, outside of any functions:
 their names should be in uppercase letters, with underscores separating words.  */
const val NAME_FOR_CONST = "Abhishek const variable"