fun main(args :Array<String>){
     val a = readLine()?.toIntOrNull() ?: return

    var answer = a
    var count = 0

    for (i in 1..a) {
        if (answer <= 1) {
            break
        }
            answer /= i
            count++
    }

    println(count)
    
}