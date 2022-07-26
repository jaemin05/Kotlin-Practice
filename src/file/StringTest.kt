package src.file

fun main() {
    var a = "Test.String"
    var b = a.split(".") // [Test, String]

    println(b.joinToString("-")) // Test-String

    println(a.startsWith("Test")) // true
    println(b.contains("ing")) //true
}