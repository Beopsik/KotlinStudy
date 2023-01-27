class User(val id: Int, val name: String, val address: String){
    override fun toString(): String = "Id: ${this.id} Name: ${this.name} Address: ${this.address}"
}

fun saveUser(user: User): Boolean {
    fun validate(
        value: String,
        fieldName: String
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    println(user)

    return true
}
fun main() {
    val user=User(213431, "mbs", "Sangdo")
    println("Save: ${saveUser(user)}")
}
