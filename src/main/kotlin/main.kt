fun main() {
    val a = IntArray(25) { (-25..25).random() }
    printArray(a)
    val key = readLine()!!.toInt()
    val index = find(key, a)
    if (index>0) {
        println("Found at: $index")
    } else {
        println("Not found")
    }

    val max = findMax(a)
    println("max = $max")
    val m1 = a.maxOrNull()
    println("standard max = $m1")

    val numMax = findNumMax(a)
    println("num max = $numMax")
}

fun findNumMax(a: IntArray): Int {
    var index = 0 // номер максимального элемента в пройденной части
    for (i in 1 until a.size) {
        if (a[i] > a[index]) { // элемент с номером i оказался больше, чем эл-т с номером index
            index = i
        }
    }
    // index - номер наибольшего элемента во всем массиве
    return index
}

fun findMax(a: IntArray): Int {
    var result = a[0]
    for (i in 1 until a.size) {
        if (a[i] > result) {
            result = a[i]
        }
    }
    return result
}

fun findMax1(a: IntArray): Int {
    var result = a[0]
    for (element in a) {
        if (element > result) {
            result = element
        }
    }
    return result
}

fun find(key: Int, a: IntArray): Int {
    for (index in a.indices) {
        if (key == a[index]) return index
    }
    return -1 // если не нашли элемент, возвращаем -1
}

fun printArray(a: IntArray) {
    for (x in a) {
        print("$x ")
    }
    println()
}
