fun main() {

    var department: Department? = null

    print(department?.head?.employer?.name)

}

class Employer(var name: String?)

class Head(var employer: Employer?)

class Department(var head: Head?)