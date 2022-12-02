fun main(args: Array<String>) {
     var arr = arrayOf(1,2,3,4,5,4,3,2,1,3,4)
//    arr.toList().groupBy{x -> x}
//    var hashMapRepeated = arr.groupingBy { it }.eachCount().toSortedMap()
//    return hashMapRepeated.get(hashMapRepeated.firstKey())


    println(arr.toList().groupBy{it})
    println(arr.toList().groupBy{it}.keys)
    println(arr.toList().groupBy{it}.keys.minOf { arr.toList().groupBy{it}.values.maxOf {it.size} })
    println(arr.toList().groupBy{it}.values.maxOf {it.size})

}