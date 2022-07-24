package src

import src.`class`.Person

fun main() {

    var p1 = Person("son", 18)

    println("안녕하세요 저는 ${p1.name}입니다.")
    p1.intro()
}