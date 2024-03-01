import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()


    if(a % 2 == 1){
        a += 3
    }

    if( a % 3 == 0){
            print(a/3)
    }
}