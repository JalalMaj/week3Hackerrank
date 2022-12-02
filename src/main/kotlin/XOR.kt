import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
  val s = readLine()?:""
  val t = readLine()?:""
    resultXor(s,t)
}
fun resultXor(s:String,t:String):String{
    var res = ""
    for (i in 0 until s.length) {
        res += if (s[i] === t[i]) "0" else "1"
    }
    return res
}