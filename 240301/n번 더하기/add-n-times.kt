import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = a+b

    for(i in 1..b){
        println(c)
        c +=b
    }
}