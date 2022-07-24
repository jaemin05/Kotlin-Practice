package src

fun main() {
    var a = 1;

    if(a > 10) {
        println(a);
    } else {
        println(a*10);
    }

    doWhen(1)
    println(returnWhen("1"))
}

//Any: 어떤 자료형이든 상관없이 작동되는 코틀린의 최상위 자료형이다.
fun doWhen(a: Any) {
    when(a) {
        1 -> println("1입니다.")
        2 -> println("2입니다.")
        !is Int -> print("정수가 아닙니다.")
        else -> println("Server Error")
    }
}

fun returnWhen(a: Any): String {
    var result = when(a) {
        1 -> "1"
        is String -> "String 타입이 입니다."
        else -> "Server Error"
    }

    return result;
}