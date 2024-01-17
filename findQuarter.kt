import kotlin.math.ceil

fun getQuarterUseWhen(month: Int): Int {
    return when(month) {
    	1, 2, 3 -> 1
        4, 5, 6 -> 2
        7, 8, 9 -> 3
        else -> 4
    }
}

fun getQuarter(month: Int): Int {
	var qt: Double = ceil(month.toDouble() / 3.0)
    return qt.toInt();
}

fun main(args: Array<String>) {
    var month: Int = 13
    if(month > 0 && month < 13) {
    	println("Tháng $month thuộc quý ${getQuarter(month)}");
        println("Tháng $month thuộc quý ${getQuarterUseWhen(month)}");
    }
}