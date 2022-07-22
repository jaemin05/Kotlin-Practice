package src

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

/*
    서브 클래스는 수퍼 클래스에 존재하는 속성과 '같은 이름'의 속성을 가질 수 없다.
    서브 클래스가 생성될 때는 반드시 수퍼클래스의 생성자까지 호출되어야 한다.
 */
open class Animal(var name: String, var type: String) {
    fun intro() {
        println("이름: ${name}")
        println("종류: ${type}")
    }
}

class Lion(name: String) : Animal(name, "포유류") {
    fun fight() {
        println("fight")
    }
}