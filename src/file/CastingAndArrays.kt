package src

fun main() {
    var a: Int = 123;

    var b: Long = a.toLong();

    /*
        코틀린은 형변환시 발생할 수 있는 오류를 막기 위해 다른 언어들이 지원하는 '암시적 형변환'은 지원하지 않는다.
        암시적 형변환: 변수를 할달할 시 자료형을 지정하지 않아도 자동으로 형변환되는 것을 의미한다.
    */

    var intArr = arrayOf(1, 2, 3, 4, 5)

    //특정 크기의 공간을 가지는 비어있는 배열
    var nullArr = arrayOfNulls<Int>(5)

    //배열에 값을 할당하거나 사용할 경우
    intArr[2] = 7
    println(intArr[2])
}