

fun main() {

    val listWithNull: List<String?> = listOf("NULL", null)

    for (item in listWithNull){
        item?.let { println(it) } // faqat NULL ni chiqaradi va null bekor qiladi
    }


}

