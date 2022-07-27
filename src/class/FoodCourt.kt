package src.`class`

class FoodCourt {
    fun searchPrice(foodName: String) {
        val price = when (foodName) {
            FOOD_PASTA -> 10000
            FOOD_STAKE -> 20000
            else -> 0
        }
    }

    companion object {
        const val FOOD_PASTA = "파스타"
        const val FOOD_STAKE = "스테이크"
    }
}