import java.util.Scanner

fun main(args: Array<String>){
    
    val n = readLine()?.toIntOrNull() ?: 0 

    val numbers = mutableListOf<Int>()

     for (i in 1..n) {
        val number = readLine()?.toIntOrNull()
        if (number != null) {
            numbers.add(number)
        }
    }

    numbers.filter{it % 2 != 0 && it % 3 == 0}.forEach{ println(it) }

}