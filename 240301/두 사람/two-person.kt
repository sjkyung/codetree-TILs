import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.next()
    var c = sc.nextInt()
    var d = sc.next()

    if((b == "M" && a > 19 )or (d == "M" && c > 19)) println("1") else println("0")
}