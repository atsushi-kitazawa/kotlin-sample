// 拡張関数はトップレベルで定義されることが一般的
// 異なるファイルからはimportすることで利用可能
fun String.toIntOrDefault(defaultValue: Int): Int {
    return this.toIntOrNull() ?: defaultValue
}

fun String.log() {
    println("LOG: $this")
}

