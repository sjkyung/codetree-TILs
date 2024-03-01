import java.util.*;
import kotlin.math.*;

fun main(args: Array<String>){

    var sc : Scanner = Scanner(System.`in`)

    var a =sc.nextDouble()
    var b =sc.nextDouble()
    var c =sc.nextDouble()

    var scale =1000

    println(String.format("%.3f",round( a*scale) / scale))
    println(String.format("%.3f",round( b*scale) / scale))
    println(String.format("%.3f",round( c*scale) / scale))
}