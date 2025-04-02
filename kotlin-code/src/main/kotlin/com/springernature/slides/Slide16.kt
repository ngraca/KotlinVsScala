import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

data class Product(val id: Long)

suspend fun findProductByName(name: String): Product =
    coroutineScope {
        println("Looking for product: $name")
        delay(10000L)
        Product(1)
    }

suspend fun getRating(id: Long): Int =
    coroutineScope {
        println("Looking for rating: $id")
        delay(1000L)
        100
    }

suspend fun getPrice(id: Long): Int =
    coroutineScope {
        println("Looking for price: $id")
        delay(2000L)
        500
    }

suspend fun main() {
    val coroutineScope = coroutineScope {
        val product = async { findProductByName("Some Product") }
        val finalProduct = product.await()

        val rating = async { getRating(finalProduct.id) }
        val price = async { getPrice(finalProduct.id) }

        val finalRating = rating.await()
        val finalPrice = price.await()
        println("$finalProduct has rating: $finalRating and price: $finalPrice")

        product
    }
    val product = coroutineScope.await()
}