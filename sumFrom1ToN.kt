fun sumFrom1To(n: Int): Int {
	return (n+1)*n/2
}

fun useLoopSumFrom1To(n: Int): Int {
    var result: Int = 0
    for (i in 1..n) {
        result += i
    }
    return result
}

fun main(args: Array<String>) {
    var test: Int = 5
    if(test > 0) {
        println(sumFrom1To(test))
        println(useLoopSumFrom1To(test))        
    }
}