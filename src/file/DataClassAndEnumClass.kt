package src.file

import src.`class`.State

fun main() {
    var state = State.SING
    println(state.message)

    state = State.EAT
    println(state.isSing())
}