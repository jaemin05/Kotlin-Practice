package src

fun main() {
    //자동으로 1씩 증가
    for (i in 1..10 step 2) {
        print(i)
    }
    println()

    for (i in 10 downTo 1 step 1) {
        print(i)
    }
    println()

    for (i in 'a'..'e') {
        print(i)
    }
}