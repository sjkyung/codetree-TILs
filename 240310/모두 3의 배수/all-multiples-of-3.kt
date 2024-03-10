fun main(args: Array<String>){

    val numbers = mutableListOf<Int>()
    repeat(5) {
    val num = readLine()!!.toInt()
    numbers.add(num)
    }

    for(num in numbers){
        if(num % 3 != 0){
            print(0)
            break;
        }
    }
    print(1)
}