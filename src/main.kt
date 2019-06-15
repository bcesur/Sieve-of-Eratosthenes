

fun main() {
    val LIMIT = 30
    var seq = generateSequence(2) { if (it < LIMIT) it+1 else null }
    var idx = 0

    while(true) {
        var num = seq.elementAt(idx)
        seq = seq.filter{(it == num) or (it % num != 0)}
        idx++
        if (idx*idx > LIMIT)
            break
    }
    println("seq in the last: " + seq.toList())

}