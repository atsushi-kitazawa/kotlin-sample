class WhenPractice {
    fun stringWhen(value: String) {
        when(value) {
            "a" -> {println("value is a")}
            "b" -> {println("value is b")}
            else -> {println("value is not a and b")}
        }
    }

    fun stringWhen2(value: String) {
        when {
            value.startsWith("hoge") -> {
                println("prefix is hoge")
            }
            value.startsWith("uga") -> {
                println("prefix is uga")
            }
        }
    }
}