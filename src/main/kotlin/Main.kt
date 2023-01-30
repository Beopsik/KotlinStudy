interface User {
    val email: String
    val nickname: String
        get() = email.substringBefore("@")
}

fun main() {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribeUser("test@kotlinlang.org").nickname)
}
