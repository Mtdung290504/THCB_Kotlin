fun getFactorialOf(n: Int): Int {
    var result: Int = 1
    for(i in 1..n) {
        result *= i
    }
    return result
}

fun main(args: Array<String>) {
    var test: Int = 5 
    if(test>0) {
        println(getFactorialOf(test))
    }
}