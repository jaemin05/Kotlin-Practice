package src

fun main() {
    var a: Int? = null //자료형 뒤에 ?를 붙이면 null을 허용하는 변수로 선언할 수 있다.
    println(a) //;이 필요없다.

    /*
        코틀린은 기본 변수에서 null을 허용하지 않으며, 변수에 값을 할당하지 않은채로 사용하게 되면 문법 에러를 표시한다.
        또한 컴파일을 막아줘서 null pointer exception을 원천적으로 차단해준다.
    */


    var b: Long = 123L;

    //char: 2바이트 내부적으로 문자열을 UTF-16 BE로 처리한다.
    var charValue = 'c'
    var stringValue = "String"
}