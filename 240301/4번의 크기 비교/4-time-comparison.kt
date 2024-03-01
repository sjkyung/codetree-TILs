import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()
    var d = sc.nextInt()
    var e = sc.nextInt()

    if(a >b) println("1") else println("0")
    if(a >c) println("1") else println("0")
    if(a >d) println("1") else println("0")
    if(a >e) println("1") else println("0")
}