package src.`class`

class NewPerson(var name: String, var age: Int) {
    init {
        println("저는 ${name}이고 ${age}살 입니다.")
    }

    constructor(name: String) : this(name, 20) {
        println("-보조 생성자 호출-")
    }
}