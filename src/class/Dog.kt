package src.`class`

import src.`interface`.Eater
import src.`interface`.Runner

class Dog : Runner, Eater {
    override fun run() {
        println("뜁니다.")
    }

    override fun eat() {
        println("먹습니다.")
    }
}