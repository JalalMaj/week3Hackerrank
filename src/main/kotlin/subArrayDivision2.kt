

/*

 Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

 Lily decides to share a contiguous segment of the bar selected such that:

 The length of the segment matches Ron's birth month, and,
 The sum of the integers on the squares is equal to his birth day.
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // Write your code here
//    return IntStream.rangeClosed(0, s.size - m)
//        .filter { i: Int -> d === IntStream.range(i, i + m).map(s::get).sum() }
//        .count().toInt()

    var count = 0
    val sz: Int = s.size
    for (i in 0 until sz) {
        var sum = 0
        var j = i
        while (j < i + m && j< sz) {
            sum += s[j]
            j++
        }
        if (sum == d) {
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    //Total number of squares
    val n = readLine()!!.trim().toInt()

    //the numbers on each of the squares of chocolate
    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    //Enter Birth day and Birth month
    val first_multiple_input = readLine()!!.trimEnd().split(" ")
    // Ron's birth day
    val d = first_multiple_input[0].toInt()
    // Ron's birth month
    val m = first_multiple_input[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
