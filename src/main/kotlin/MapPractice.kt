class MapPractice {
    val employee = mapOf(100 to "bob", 101 to "alice", 102 to "rob")

    fun printMap() {
        employee.forEach {(key, value) ->
            println("key:$key, value:$value")
        }
    }

    fun get() {
        println(employee.get(100))
        println(employee.get(200) ?: "not exist key")
    }

    // マップのキーのみに変換関数を適用する
    fun mapKeys() {
        val employee1 = employee.mapKeys { (key, _) -> "ID-$key" }
        employee1.forEach { (key, value) ->
            println("key:$key, value:$value")
        }
    }

    fun filterKey() {
        employee.filterKeys { key -> key % 2 == 0 }.forEach { println(it) }
    }
}