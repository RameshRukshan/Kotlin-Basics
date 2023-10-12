open class Product {
    var price: Float = 0.00F

    fun setProductPrice(x: Float) {
        price = x
    }
}

class Electronic : Product() {
    var discount: Float = 0.00F
    var total: Float = 0.00F

    fun setElectronicDiscount(y: Float) {
        discount = y
    }

    fun calculatePrice() {
        total = price - discount
        println("Discounted prizce is: $total")
    }
}

fun main() {
    val elp = Electronic()
    elp.setProductPrice(1034.4F)
    elp.setElectronicDiscount(234.8F)
    elp.calculatePrice()
}
