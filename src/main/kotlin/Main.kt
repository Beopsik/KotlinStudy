data class Client(val name: String, val postalCode: Int)

fun main() {
    val client1 = Client("mbs", 1)
    val client2 = Client("mbs", 1)

    println(client1)
    println(client1 == client2)
}
