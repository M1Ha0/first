class Validator<T> {

    private val rules = mutableListOf<(T) -> Boolean>()

    fun addRule(rule: (T) -> Boolean) {
        rules.add(rule)
    }

    fun validate(value: T): Boolean {
        return rules.all { rule -> rule(value) }
    }

    fun validateAll(values: List<T>): List<Boolean> {
        return values.map { value -> validate(value) }
    }
}
fun main() {
    val validator = Validator<Int>()

    validator.addRule { it > 0 }
    validator.addRule { it % 2 == 0 }

    println(validator.validate(4))   // true
    println(validator.validate(3))   // false

    val values = listOf(2, 3, 4, -2, 8)
    println(validator.validateAll(values))
}