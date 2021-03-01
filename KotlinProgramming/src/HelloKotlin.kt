import com.example.edu.Person as User

// Tools => Kotlin => Show Bytecode => Decompile (Java 버전으로 소스 확인 가능)
fun main() {
    println("Hello Kotlin!")

    val person = User("Kildong", 20)
    val person2 = Person(123, "Kildong", "Programmer")

    println(person)
    println(person.name)
    println(person.age)
}

class Person(val no: Int, val name: String, val jobTitle: String)