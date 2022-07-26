package src.file

fun main() {
    var a: String? = null

    println(a?.toUpperCase()) //null이면 뒤에있는 구문 실행 X
    println(a ?: "default".toUpperCase()) // null이면 뒤에있는 걸로 대체
    println(a!!.toUpperCase()) //null 여부를 컴파일 시 확인하지 않게 한다. <- 런타임시 null pointer exception이 나도록 의도적으로 방치

    var b: String? = "Kotlin"

    b?.run {
        println(toUpperCase())
    }
}