import java.util.*

fun main() {
//    val n = readLine()!!.toInt()
//    val a = readLine()!!.split(" +".toRegex()).map(String::toInt).toIntArray()
    val s = Scanner(System.`in`)
    val n = s.nextInt()
    val a = IntArray(n) { s.nextInt() }
    val min = findMin(a)
    val k = count(min, a)
    //cheat(min, k, a)
    val res = createArray(min, k, a)
    for (x in res) {
        print("$x ")
    }
}

fun createArray(min: Int, k: Int, a: IntArray): IntArray {
    val result = IntArray(a.size) { min }
    var p = k
    for (x in a) {
        if (x != min) {
            result[p] = x
            p++
        }
    }
    return result
}

fun cheat(min: Int, k: Int, a: IntArray) {
    repeat(k) {
        print("$min ")
    }
    for (element in a) {
        if (element != min) {
            print("$element ")
        }
    }
}

fun count(x: Int, a: IntArray): Int {
    var result = 0
    for (element in a) {
        if (element == x) {
            result++
        }
    }
    return result
}

fun findMin(a: IntArray): Int {
    var result = a[0]
    for (element in a) {
        if (element < result) {
            result = element
        }
    }
    return result
}


