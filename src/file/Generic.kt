package src.file

import src.`class`.A
import src.`class`.B
import src.`class`.UsingGeneric

fun main() {

    //생성자를 통해 타입 파라미터 생략 가능
    UsingGeneric(A()).doShouting()
    UsingGeneric(B()).doShouting()

    doShouting(B())
}

fun <T : A> doShouting(t: T) {
    t.shout()
}