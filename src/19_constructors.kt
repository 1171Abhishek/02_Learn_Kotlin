class Mobile(var brand: String, var model: String, var year: Int)

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


}