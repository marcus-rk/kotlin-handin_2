package Exercise_2

// Note to self: private val/var is not needed, thus they inherent from super-class
class SmartPhone(
    private val productID: String,
    private var price: Double,
    private var color: String,
    private val contactList: MutableList<String> = mutableListOf()
) : Computer(productID, price, color) {

    fun addContact(phoneNumber: String): Unit {
        this.contactList.add(phoneNumber)
    }

    fun removeContact(phoneNumber: String): Unit {
        this.contactList.remove(phoneNumber)
    }

    override fun toString(): String {
        return super.toString().dropLast(1) + ", contactList=${this.contactList.toString()}]"
    }

}