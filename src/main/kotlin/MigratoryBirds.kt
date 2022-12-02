fun migratoryBirds(arr: Array<Int>): Int {
    // Write your code here
//    return arr.toList().groupBy { it }.toList().sortedBy { (_, value) -> value.size }
//        .groupBy { it.second.size }.values.last().toMap().keys.minOf { it }

    // functional programming
//    arr.groupBy { it }.toList().groupBy { (_, v) -> v.size }
//        .maxBy { it.key }.value.minByOrNull { (key, _) -> key }!!.first

    var max = arr.toList().groupBy { it }.toList().sortedBy { (key, value) -> value.size }
        .groupBy { it.second.size }.values.last().toMap().keys.min()
    return max!!.toInt()

}

fun main(args: Array<String>) {
    // val arrCount = 11

    //val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val array = arrayOf(3, 4, 5, 4, 3, 2, 2, 1, 3, 4, 1, 1)
    val result = migratoryBirds(array)

    println(result)

}
