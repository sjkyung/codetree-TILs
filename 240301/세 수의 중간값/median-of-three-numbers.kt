import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()
    
    if(c > b && b > a ) print("1") else print("0")
}