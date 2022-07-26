package src.`class`

class Cola : Drink() {
    var type = "콜라"

    override fun drink() {
        println("${type}을 마십니다.")
    }

    fun washDishes() {
        println("${type}을 설거지 합니다.")
    }
}