class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore("@"))
//        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
    }
}
fun main() {
    val subScribingUser = User.newSubscribingUser("test@gmail.com")
//    val facebookUser = User.newFacebookUser(3)
    println(subScribingUser.nickname)
}
