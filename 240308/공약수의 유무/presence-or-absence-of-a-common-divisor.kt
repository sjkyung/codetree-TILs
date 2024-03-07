import java.util.*;

fun main(args :Array<String>){
    var sc : Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = 0

    for(i in a..b){
        if(1920 % i == 0 && 2880 % i == 0) c += 1 else c += 0
    }

    print(if(c > 1) 1 else c)
}