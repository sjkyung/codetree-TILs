import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)

    var a =sc.nextInt()
    var c =sc.nextInt()

    for(i in a..c){
        if(i%2 ==1 ){
            print("$i ")
        }
    }
}