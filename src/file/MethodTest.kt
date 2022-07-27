package src.file

fun main() {
    deliveryItem("tv", destination = "좋은 집")

    println(6 multiply 4) //24 (6 <- this, 4 <- x)
}

fun deliveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("${name} : ${count} : ${destination}")
}

/*
    vararg: 값은 자료형 여러개를 파라미터로 받을 때 사용한다.
    다른 파라미터랑 사용시에는 마지막에 위치해야 한다.
*/
fun sum(vararg number: Int) {
    var sum = 0

    for(n in number) {
        sum += n
    }

    println(sum)
}

infix fun Int.multiply(x : Int): Int = this * x