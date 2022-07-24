package src.`class`

class FoodPoll(val name: String) {

    //공유된다.
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total += 1
        count += 1
    }
}