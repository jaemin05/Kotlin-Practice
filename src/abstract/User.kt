package src.abstract

abstract class User {
    abstract fun signup()
    fun login() {
        println("로그인 중...")
    }
}