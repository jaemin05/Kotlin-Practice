package src

fun main() {
    var a: Int? = null //자료형 뒤에 ?를 붙이면 null을 허용하는 변수로 선언할 수 있다.
    println(a) //;이 필요없다.

    var b: Long = 123L;

    //char: 2바이트 내부적으로 문자열을 UTF-16 BE로 처리한다.
    var charValue = 'c'
    var stringValue = "String"
}