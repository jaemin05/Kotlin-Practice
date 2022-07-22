package src

fun main() {

    var p1 = Person("son", 18)

    println("안녕하세요 저는 ${p1.name}입니다.")
    p1.intro()
}

class Person(var name: String, var age: Int) {
    fun intro() {
        println("제 나이는 ${age}살 입니다.")
    }
}