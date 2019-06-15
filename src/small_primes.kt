fun main() {
    val LIMIT : Int = 20
    var big_seq = (2..LIMIT).asSequence()
    var idx : Int = 0
    //var num: Int

    while (true){
        val num = big_seq.elementAt(idx)

        println(num)
        //big_seq = big_seq.filter { it % big_seq.elementAt(idx) != 0 }
        big_seq = big_seq.filter {  (it % num != 0) || (it == num)}
        println(big_seq.toList())
        idx++
        if (idx >= big_seq.count())
            break
    }
    println(big_seq.toList())
}