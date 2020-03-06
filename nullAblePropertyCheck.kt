
fun main() {

    var nullAble: String? = "Null"

    var l = if (nullAble != null) nullAble.length else -1

    print(nullAble)
}