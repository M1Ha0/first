fun sumLists(list1: List<Int>, list2: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in list1.indices) {
        result.add(list1[i] + list2[i])
    }
    return result
}

data class Product(
    val price: Int,
    val stock: Int
)

// Пример использования
fun main() {
    //1
    val list1 = listOf(1, 2, 3, 4)
    val list2 = listOf(5, 6, 7, 8)

    val result = sumLists(list1, list2)
    println(result)
    //2
    val students = setOf("Tom", "Bob", "Sam")
    val employees = setOf("Tom", "Bob", "Alex", "Mike")

    val allPeople = students union employees

    val both = students intersect employees

    val onlyStudents = students subtract employees

    val onlyOneGroup = (students union employees) subtract (students intersect employees)

    println("Все люди: $allPeople")
    println("Учатся и работают: $both")
    println("Только учатся: $onlyStudents")
    println("Только в одной группе: $onlyOneGroup")

    //3
    val products = mapOf(
        "Картофель" to Product(50, 20),
        "Морковь" to Product(80, 15),
        "Яблоки" to Product(120, 25),
        "Бананы" to Product(90, 5),
        "Капуста" to Product(70, 12)
    )

    for ((name, product) in products) {
        if (product.price <= 100 && product.stock >= 10) {
            println("$name: цена = ${product.price} руб., остаток = ${product.stock} кг")
        }
    }
}
