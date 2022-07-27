package src.file

import src.`class`.Outer

fun main() {
    Outer.Nested().introduce()

    val outer = Outer()
    val inner =  outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()
}

