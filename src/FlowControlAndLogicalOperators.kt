package src

fun main() {

    for (i in 1..3) {
        for (j in 1..3) {
            if (i == 1 && j == 1) break
            println("i: $i, j: $j")
            /*
            i: 2, j: 1
            i: 2, j: 2
            i: 2, j: 3
            i: 3, j: 1
            i: 3, j: 2
            i: 3, j: 3
             */
        }
    }

    loop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 1 && j == 2) break@loop
            println("i: $i, j:$j") // i:1, j:1
        }
    }
}