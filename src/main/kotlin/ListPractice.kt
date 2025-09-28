class ListPractice {
    // リストの中身を順次処理する
    // 大文字に変換して表示する
    fun printInListContent() {
        val list = listOf("a", "b", "c")
        list.forEach {
            val s = it.uppercase()
            println(s)
        }
    }

    // リストの中身を2倍にした新たなリストを生成する
    fun doubleInListContent() {
        val list = listOf(1, 2, 3)
        val doubleList = list.map { it * 2 }
        println(doubleList)
    }

    // aで始まる文字列だけをフィルターして、かつ、大文字に変換する
    fun findStringAndFilter() {
        val list = listOf("bob", "alice", "devil", "ana")
        val afterList = list.filter { it.startsWith("a") }.map { it.uppercase() }
        println(afterList)
    }

    // ソートする
    // 集計処理を実施する
}