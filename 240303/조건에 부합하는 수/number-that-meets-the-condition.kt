import java.util.*;

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    

    for (num in 1..a) {
        if (num % 2 == 0 && num % 4 != 0) {
            //println("$num ")
        } else if (num / 8 % 2 == 0) {
            //println("$num ")
        } else if (num % 7 < 4) {
            //println("$num ")
        }else{
            print("$num ")
        }
        
    }
        
       
    
    
}