

/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here
    var count = 0
    var sum = 0

    var map = hashSetOf<Int>()
    map.addAll(ar)

    for (value in map) {
        for (i in 0 until n) {
            if (ar[i] == value) {
                sum++
            }
        }
        if (sum > 1) count += sum/2
        sum =0
    }

    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}

