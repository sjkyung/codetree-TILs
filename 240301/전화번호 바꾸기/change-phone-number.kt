import java.util.Scanner

fun main(args: Array<String>){
    var a = readLine()
    var c = a?.split("-")?: listOf("", "", "")

   


    print("${c[0]}-${c[2]}-${c[1]}")
}