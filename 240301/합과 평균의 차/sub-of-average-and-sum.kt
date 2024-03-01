import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()

    println(a+b+c)
    println((a+b+c)/3)
    println( (a+b+c) - ((a+b+c)/3) )

}