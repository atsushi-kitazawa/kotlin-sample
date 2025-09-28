data class Person(val id: Int, val name: String, val email: Email) {
}

class Email(address: String) {
    private var address: String

    init {
        this.address = address
        // address check
    }

    override fun toString(): String {
        return super.toString()
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}