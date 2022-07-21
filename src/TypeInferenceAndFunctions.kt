package src

fun main() {
    //타입추론: 변수나 함수들을 선언할 때나 연산이 이루어질 때 자료형을 코드에 명시하지 않아도 코틀린이 자동으로 자료형을 추론하는 기능

    var a = 1234 //Int
    var b = 1234L //Long
    var c = 12.34 //Double
    var d = 12.34 //Float

    var e = 0xABCD //Int
    var f = 0b0101011 //Int

    var g = true //boolean
    var h = 'c' //char

    println(add(1,2))
    println(minus(2,1))
}

fun add(a: Int, b: Int): Int {
    return a + b;
}

fun minus(a: Int, b: Int) = a - b