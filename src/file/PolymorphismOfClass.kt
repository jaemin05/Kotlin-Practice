package src.file

import src.`class`.Cola
import src.`class`.Drink

fun main() {
    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    //is 는 조건문 안에서만 잠시 다운캐스팅 된다.
    if (b is Cola) {
        b.washDishes()
    }

    /*
        b.washDishes <- 참조할 수 없음
        as를 사용하면 반환값 뿐만 아니라 변수 자체도 다운캐스팅된다. 
     */
    var c = b as Cola
    c.washDishes()
    b.washDishes()
}