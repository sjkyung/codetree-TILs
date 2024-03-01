import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()

    if(a > 0){
        for(i in 1..b){
            print(a)
        }
    }else{
        print(0)
    }
}