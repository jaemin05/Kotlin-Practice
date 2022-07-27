package src.`class`

enum class State(val message: String) {
    SING("노래"),
    EAT("밥");

    fun isSing() = this == SING
}