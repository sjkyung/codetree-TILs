import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()


    if(a >=3000){
        print("book")
    }else if(a >=1000){
        print("mask")
    }else{
        print("no")
    }
}