

fun main() {
    val nullAbleList: List<Int?> = listOf(1, 2, null, 4)
    val nonNullList:List<Int> = nullAbleList.filterNotNull()
    print(nonNullList)
}

