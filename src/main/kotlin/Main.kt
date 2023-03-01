fun main(args: Array<String>) {
    println("Hello, Kotlin");

    fun mult(a: Int, b: Int) = a * b
    val a = 15
    val name = "Kotlin"
    val age1 = 123
    val description = "Language $name, age: $age1"
    println(description)

    val age: Int
    val longNumber1: Long = 9L
    val floatNumber: Float = 123.123f
    val charSymbol1: Char = 'u'
    val textString: String = "Котлин - статически типизированный язык программирования,  \nразрабатываемый компанией JetBrains"
    print(textString)

    var typeAny: Any = "Any type"
    typeAny = 235
    print(typeAny)


}