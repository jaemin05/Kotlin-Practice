package src

fun main() {
    //고차 함수 형태로 넘길시 :: 붙인다.
    b(::a)

    val c: (String) -> Unit = { str -> println("$str 람다함수")}
    b(c)
}

fun a(str: String) {
    println("$str 함수 a")
}

/*
    함수를 파라미터로 받아올 경우
    Unit: 반환형에 값이 없다는 형식
*/

fun b(function: (String) -> Unit) {
    function("b 호출")
}

