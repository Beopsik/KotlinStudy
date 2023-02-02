fun sendEmailTo(email: String) {
    println("Send email to $email")
}


fun main() {
    val email: String? = "test@email.com"
    email?.let { sendEmailTo(it) }
}
