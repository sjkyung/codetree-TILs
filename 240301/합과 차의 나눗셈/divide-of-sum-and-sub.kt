import java.util.Scanner
import kotlin.math.*;

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)

    var  a = sc.nextDouble()
    var  b = sc.nextDouble()
 
    var  c = (a + b) / (a - b) 
    var scale = 100
    print(String.format("%.2f",c)) 
}