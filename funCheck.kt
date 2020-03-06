import java.lang.IllegalArgumentException

fun main() {


}

class User(private var name: String, private var parent: String) {

    fun getParent(): String? = parent

    fun getName(): String? = name

}

fun check(user: User): String? {
    val parent = user.getParent() ?: return null
    val name = user.getName() ?: throw IllegalArgumentException("name kutilgan edi")
}