fun main() {

    // Обобщенные типы
    val tom: Person<Int> = Person(367, "Tom")
    val bob: Person<String> = Person("A65", "Bob")
    println("${tom.id} - ${tom.name}")
    println("${bob.id} - ${bob.name}")
    val people: Array<String> = arrayOf("Tom", "Bob", "Sam")
    val numbers: Array<Int> = arrayOf(1,2,3,4)


    // Применение нескольких параметров
    var word1:Word<String, String> = Word("one", "two")
    var word2:Word<String, Int> = Word("two", 2)


    // Обобщенные функции
    display("Привет Данила Сильченков")
    display(1234)
    display(true)

    val arr1 = getBiggest(arrayOf(1,2,3,4), arrayOf(5,6,7,8,2,2))
    arr1.forEach { item -> println("$item ") }

    println()

    val arr2 = getBiggest(arrayOf("Tom", "Sam", "Bob"), arrayOf("Kate", "Alice"))
    arr2.forEach { item -> println("$item ") }
}

// Обобщенные типы
class Person<T>(val id: T, val name: String) {
    fun checkId(_id: T){
        if(id == _id){
            println("The same")
        }else{
            println("Different")
        }
    }
}

// Применение нескольких параметров
class Word<K, V>(val sourse:K, val target:V)

// Обобщенные функции
fun<T> display(obj:T){
    println(obj)
}

fun<T> getBiggest(args1: Array<T>, args2: Array<T>): Array<T> {
    if (args1.size > args2.size) return args1
    return args2
}