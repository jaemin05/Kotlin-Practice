package src.`class`

class Outer {
    var text = "Outer Class"

    class Nested {
        fun introduce() {
            println("Outer Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"

        fun introduceInner() {
            println(text)
        }

        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}