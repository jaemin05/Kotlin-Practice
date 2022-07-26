package src.`class`

import src.`interface`.EventListener

class EventPrinter {
    fun start() {

        //인터페이스를 구현한 객체를 코드 중간에도 즉시 생성해서 사용할 수 있다.
        val counter = Counter(object : EventListener {
            override fun onEvent(count: Int) {
                println("${count}-")
            }
        })
        counter.count()
    }
}