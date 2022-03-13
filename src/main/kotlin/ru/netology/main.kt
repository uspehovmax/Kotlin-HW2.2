/**
 *  Idea of program - find current word "человеку" or "людям"
 *  if Digit of number of people likes is end "1" but NOT "11" - is "человеку"
 *  all other - is "людям"
 */

val likes1 = 1
val likes11 = 11
val likes21 = 21
val likes651 = 651
val likes585 = 585
val likes39876 = 39876

fun main() {
    
    println("МЕТОД 1. Остаток от деления \"1\", но не \"11\" ")
    println("Понравилось $likes1 ${divisionReminder(likes1)}")
    println("Понравилось $likes11 ${divisionReminder(likes11)}")
    println("Понравилось $likes21 ${divisionReminder(likes21)}")
    println("Понравилось $likes585 ${divisionReminder(likes585)}")
    println("Понравилось $likes651 ${divisionReminder(likes651)}")
    println("Понравилось $likes39876 ${divisionReminder(likes39876)}")

    println()
    println("МЕТОД 2. Определение по символу \"1\" ")
    println("Понравилось $likes1 ${lastChar(likes1)}")
    println("Понравилось $likes11 ${lastChar(likes11)}")
    println("Понравилось $likes21 ${lastChar(likes21)}")
    println("Понравилось $likes585 ${lastChar(likes585)}")
    println("Понравилось $likes651 ${lastChar(likes651)}")
    println("Понравилось $likes39876 ${lastChar(likes39876)}")
}

fun divisionReminder (likes:Int) : String {
    val peoples : String
    if (likes % 10 == 1 && likes % 100 != 11 ) peoples = "человеку"
    else peoples = "людям"

    return peoples
}

fun lastChar(likes:Int): String {
    val peoples : String
    val likesString = likes.toString()       // перевод в строку
    val length = likesString.length          // длина строки
    val lastDigit = likesString[length-1]    // последняя цифра
    var preLastDigit = '0'                   // предпоследняя цифра

    if (length > 1 ) preLastDigit = likesString[length-2]

    if (length == 1 && lastDigit == '1' || lastDigit == '1' && preLastDigit != '1') peoples = "человеку"
    else peoples = "людям"

    return peoples
}
