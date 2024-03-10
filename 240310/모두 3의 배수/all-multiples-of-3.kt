fun main(args: Array<String>){

    val numbers = List(5) { readLine()!!.toInt() }

    val result = if (numbers.all { it % 3 == 0 }) print(1) else print(0)
}