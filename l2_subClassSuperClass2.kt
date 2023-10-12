open class Product {
    var price: Float = 0.00F

    fun setPrice(x: Float) {
        price = x
    }
}

class Electronic : Product() {
    var discount: Float = 0.00F
    var total: Float = 0.00F

    fun setDiscount(y: Float) {
        discount = y
    }

    fun calculatePrice() {
        total = price - discount
        println("Discounted price is: $total")
    }
}

fun main() {
    val elp = Electronic()
    elp.setPrice(1034.4F)
    elp.setDiscount(234.8F)
    elp.calculatePrice()
}
