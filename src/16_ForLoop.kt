fun main() {

    for (i in 1..10) {
        println(i)
    }

    for (character in 'a'..'z') {
        println(character)
    }

    for (i in 1..10) {
        println(i)
        if (i == 2) {
            break
        }
    }

    for (i in 1..10) {
        if (i == 4) {
            continue
        }
        println(i)
    }


}