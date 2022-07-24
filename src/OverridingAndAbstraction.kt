package src

fun main() {
    val s = Son()
    s.eat()

    var user = UserLogin()
    user.login()


}

open class People {
    open fun eat() {
        println("음식을 먹습니다.")
    }
}

class Son : People() {
    override fun eat() {
        println("고기를 먹습니다.")
    }
}

abstract class User {
    abstract fun signup()
    fun login() {
        println("로그인 중...")
    }
}

class UserLogin : User() {
    override fun signup() {
        println("회원가입 중...")
    }
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다.")
    }
}

class Dog : Runner, Eater {
    override fun run() {
        println("뜁니다.")
    }

    override fun eat() {
        println("먹습니다.")
    }
}