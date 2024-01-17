import kotlin.math.sqrt

fun ptb1(a: Double, b: Double): String {
	if(a == 0.0) {
    	return "a phải khác 0"
    }
	var result: Double = -b/a
	return "${a}x + ${b} = 0\n<=> x = ${result}"
}
fun ptb2(a: Double, b: Double, c: Double): String {
	var result: String = "${a}x^2 + ${b}x +${c} = 0\n<=> "
    if(a == 0.0) {
    	return ptb1(b, c)
    }
    if(a+b+c == 0.0) {
    	var x2: Double = c/a
    	result += "x1 = 1; x2 = ${x2}"
    } else if(a-b+c == 0.0) {
    	var x2: Double = -c/a
    	result += "x1 = -1; x2 = ${x2}"
    } else {
    	var delta: Double = b*b - 4*a*c
        if(delta > 0.0) {
        	var x1: Double = (-b + sqrt(delta)) / (2*a)
            var x2: Double = (-b - sqrt(delta)) / (2*a)
            result += "x1 = ${x1}; x2 = ${x2}"
        } else if(delta == 0.0) {
        	var x: Double = -b/2*a
        	result += "x1 = x2 = ${x}"
        } else {
        	result += "Vô nghiệm"
        }
    }
    return result;
}

fun main(args: Array<String>) {
	var a : Double = 3.0
    var b : Double = -10.0
    var c : Double = 3.0
	println(ptb1(a, b))
    println()
	println(ptb2(a, b, c))
}