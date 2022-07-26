package src.file

fun main() {
    var a = listOf(1, 2, 3)

    var b = mutableListOf(6, 3, 1)

    b.add(2, 8) //<- 2번 자리에 8을 추가
    b.removeAt(1) // <- 1번 자리 삭제
}