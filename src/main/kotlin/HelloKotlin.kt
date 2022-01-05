import com.example.edu.Person as User

fun main() {
    println("Hello Kotlin!")

    val person = User( name = "Kildong", age =  20)
    val person2 = Person(no = 123, name = "Kildong", jobTitle = "Programmer")

    println(person)
    println(person.name)
    println(person.age)
}

class Person(val no: Int, val name: String, val jobTitle: String)