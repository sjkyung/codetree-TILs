import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()

    if( a > b ){
        if(a < c){
            print(a)
        }else{
            print(c)
        }
    }else{
        if(b < c){
            print(b)
        }else{
            print(c)
        }
    }  
}