package src

import src.`class`.Animal
import src.`class`.Lion

/*
    코틀린은 상속 금지가 기본 상태이다.
    open은 클래스가 상속될 수 있도록 클래스 선언시 붙여줄 수 있는 키워드이다.
 */
fun main() {
    var a = Animal("a", "fish")
    var b = Lion("b")

    a.intro()
    b.intro()
    b.fight()
}