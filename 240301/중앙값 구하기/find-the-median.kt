import java.util.Scanner

fun main(args: Array<String>){
    var input = readLine()!!.split(" ")
    var list = input.map{it.toInt()}.sorted()

    print(list[1])
}