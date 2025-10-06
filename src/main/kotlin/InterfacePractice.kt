class InterfacePractice {

    interface Animal {
        val name: String
        fun walk()
    }

    class Person(override val name: String) : Animal {
        override fun walk() {
            println("$name 四足歩行")
        }
    }

    class Dog(override val name: String) : Animal {
        override fun walk() {
            println("$name 二足歩行")
        }
    }

    fun test1() {
        val list = mutableListOf<Animal>()
        list.add(Person("bob"))
        list.add(Dog("pochi"))
        list.add(Person("alice"))
        list.forEach { e -> e.walk() }

        list.forEach { e ->
            run {
                when (e) {
                    is Person -> println("Person class")
                    is Dog -> println("Dog class")
                }
            }
        }
    }
}