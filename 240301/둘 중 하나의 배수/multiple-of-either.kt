import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()

    if((a % 3 == 0) or (a % 5 ==0)) print("1") else print("0")
}