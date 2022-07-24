package src.`class`

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