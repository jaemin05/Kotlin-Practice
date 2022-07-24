package src

fun main() {

    var price = 5000

    val cal: (Int, Int) -> Int = { num1, num2 ->
        println("더한 값: ")
        num1 + num2
    }

    val b: () -> Unit = { println("파라미터 X") }

    val c: (String) -> Unit = { println("$it 람다함수") }

    /*
        인스턴스를 생성하자마자 참조연산자 없이 직접 인스턴스의 속성과 함수를 사용할 수 있다.
        apply는 인스턴스 자신을 다시 반환한다.
    */
    var book = Book("니체의 위험한 책", 10000).apply {
        name = "[그린비] " + name
        discount()
    }

    book.run {
        println("상품명: ${name}, 가격: ${price}원")
    }

    //with(book) <- run 과 같은 파라미터로 받는 다는 점만 다르다.

    book.let {
        println("상품명: ${it.name}, 가격: ${it.price}원")
    }

    //also는 apply대신 let처럼 사용 가능하다.
}

class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 1000
    }
}

