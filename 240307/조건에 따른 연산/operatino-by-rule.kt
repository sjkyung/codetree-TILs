import java.util.*;

fun main(args : Array<String>){
    var sc : Scanner = Scanner(System.`in`)

    var n = sc.nextInt()
    var count = 0

    while(n < 1000){
        if(n % 2 == 0){
            n = n * 3 +1    
            count++
        }else if(n % 2 == 1){
            n = n * 2  +2
            count++
        }
    }

    System.out.print(count)
}