package src.file

import src.`class`.FoodCourt
import src.`class`.LateInitSample

/*
    lateinit val 변수 제약조건
    1. 초기값 할당 전까지 변수를 사용할 수 없다.
    2. 기본 자료형에는 사용 불가 (String 은 가능)
*/
fun main() {
    val foodCourt = FoodCourt()
    foodCourt.searchPrice(FoodCourt.FOOD_STAKE)

    val text = LateInitSample()
    println(text.getLateInitText())

    val number: Int by lazy {
        println("초기화 시작")
        1
    }

    println("값 출력")
    println(number)
}
