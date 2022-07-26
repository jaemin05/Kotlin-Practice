package src.`class`

class Counter(var listener: src.`interface`.EventListener) {
    fun count() {
        for (i in 1..10) {
            listener.onEvent(i)
        }
    }
}