import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()

    if(a %3 == 0) println("YES") else println("NO")

    if(a %5 == 0) print("YES") else print("NO")

}