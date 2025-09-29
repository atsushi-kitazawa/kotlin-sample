import java.time.LocalDate

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

    // いろんな型をソートする
    fun sortedList() {
        val list = listOf(5, 2, 7, 10, 1)
        println(list.sorted())
        println(list.sortedDescending())

        val listString = listOf("a", "z", "d", "A")
        println(listString.sorted())
        println(listString.sortedDescending())

        val listDate =
            listOf(LocalDate.parse("2025-09-29"), LocalDate.parse("2025-09-01"), LocalDate.parse("2025-10-01"))
        println(listDate.sorted())
        println(listDate.sortedDescending())

        // 定義型のソート
        val listData = listOf(ListedDate(10, "aaa"), ListedDate(1, "bbb"), ListedDate(15, "AAA"), ListedDate(5, "AAA"))
        // idでソート（昇順）
        println(listData.sortedBy { it.id })
        // idでソート（降順）
        println(listData.sortedBy { it.id }.reversed())
        // nameでソート
        println(listData.sortedBy { it.name })
        // nameでソートして、nameが同じならばidでソートする
        println(listData.sortedWith(compareBy<ListedDate> { it.name }.thenBy { it.id }))
    }

    data class ListedDate(val id: Int, val name: String) {}

    // 集計処理を実施する
    fun aggregate() {
        val list = listOf(1, 2, 3)
        println(list.sum())
        println(list.average())
        println(list.map { it * 2 }.sum())
    }
}