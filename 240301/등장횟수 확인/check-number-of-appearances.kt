import java.util.Scanner

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()
    var d = sc.nextInt()
    var e = sc.nextInt()

    var cnt = 0

   if(a % 2 == 0){
    cnt += 1
   }

   if(b % 2 == 0){
    cnt += 1
   }

   if(c % 2 == 0){
    cnt += 1
   }
   if(d % 2 == 0){
    cnt += 1
   }
   if(e % 2 == 0){
    cnt += 1
   }

   print(cnt)

}