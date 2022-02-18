package part2
//Оператор when
/*
Напишите программу, которая считывает строку и выводит:
"A", если её длина больше 0 и меньше 11;
"B", если её длина равна 20
"C", если её длина равна 15
"D" во всех остальных случаях.

Использовать условный опреатор if-else запрещено.

 */
fun solution(a: String): Char {
    TODO("Not yet implemented")

    when a
}

fun main() {
    println(solution("5"))                      // A
    println(solution("Hello"))                  // D
    println(solution(""))                       // D
    println(solution("01234567890123456789"))   // B
    println(solution("0123456789abcde"))        // C
}


