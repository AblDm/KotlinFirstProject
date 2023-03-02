import java.util.*

fun main(args: Array<String>) {

    /**
     * тренировка по инициализации переменных в Kotlin
     */
    println("Hello, Kotlin")
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
    val textString: String =
        "Котлин - статически типизированный язык программирования,  \nразрабатываемый компанией JetBrains"
    print(textString)

    var typeAny: Any = "Any type"
    typeAny = 235
    print(typeAny)

    /**
     * Тренировка получение данных от пользоватлея в Kotlin и работа с условиями, конструкция if
     */

    print("\nВведите возраст: ")

    val reader = Scanner(System.`in`)
    var age2 = reader.nextInt()

    if (age2 > 18)
        println("В клуб можно")
    if (age2 == 18)
        println("Вам 18")
    else
        println("В клуб нельзя")


    /**
     * Тренировка получение данных от пользоватлея в Kotlin и работа с условиями, конструкция when оператор in
     */

    val a3 = 18

    when {
        a3 < 18 -> println("18")
        a3 < 55 -> println("a < 55")
        else -> println("a=<55")
    }

    val age3 = 18
    when (age3) {
        in 7..18 -> println("Школьник")
        in 18..22 -> println("Студент")
        in 22..24 -> println("Магистрант")
        in 24..28 -> println("Аспирант")
        !in 7..28 -> println("Вне диапазона")
        else -> println("Не цифра")
    }

    /**
     * Тренировка представление данных в строке
     */
    println("\nВведите возраст")
    val reader1 = Scanner(System.`in`)
    var age4 = reader1.nextInt()
    println("Установлен возраст: $age4")

    println("Введите имя")
    val reader2 = Scanner(System.`in`)
    var name1 = reader2.next()
    println("Установлено имя: $name1")

    println("Привет, $name1! Вам $age4 лет")

    /**
     * Тренировка по синтаксису функций
     */

    var a2: Int = 10
    var b2: Int = 20

    fun isABigerB(a2: Int, b2: Int) = when {
        a2 < b2 -> println("<")
        a2 > b2 -> println(">")
        a2 == b2 -> println("=")
        else -> println("несопоставимый формат")
    }
    isABigerB(a2, b2)

    fun multipleOfThreeNumbers(a4: Int, a5: Int, a6: Int) = println(a4 * a5 * a6)


    /**
     * Тренировка вывод чётного числа из 2х чисел с разной чётностью
     */
    val reader4 = Scanner(System.`in`)
    var a7 = reader4.nextInt()
    var b3 = Math.abs(a7) + 3
    if (b3 % 2 == 0)
        println(b3)
    else
        println(a7)

    /**
     * Тренировка с конструкцией when
     */

    val reader5 = Scanner(System.`in`)
    var a8 = reader5.nextInt()
    when {
        a8 == 1 -> println("Понедельник")
        a8 == 2 -> println("Вторник")
        a8 == 3 -> println("Среда")
        a8 == 4 -> println("Четверг")
        a8 == 5 -> println("Пятница")
        a8 == 6 -> println("Суббота")
        a8 == 7 -> println("Воскресение")
        else -> println("В неделе 7 дней")
    }
    /**
     * особенности работы с массивами
     */

    val arrNum: Array<Int> = arrayOf(64,13,52,62)
    val getNum  = arrNum[3]

    val integerNumArr: IntArray = intArrayOf(12,1214,124,5,5)
    val charArr: CharArray = charArrayOf('a','d')


}