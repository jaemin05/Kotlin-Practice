package src.`class`

class UsingGeneric<T : A>(val t: T) {
    fun doShouting() {
        t.shout()
    }
}