
/*
Problem: Merge two arrays alternately.

Input:
A = [10, 50, 20, 30, 70, 80, 40]
B = [25, 75, 5, 25]

Output:
[10, 25, 50, 75, 20, 5, 30, 25, 70, 80, 40]
*/

fun mergeAlternate(a: IntArray, b: IntArray): IntArray {
    val result = IntArray(a.size + b.size)
    var i = 0
    var j = 0
    var k = 0

    while (i < a.size && j < b.size) {
        result[k++] = a[i++]
        result[k++] = b[j++]
    }

    while (i < a.size) {
        result[k++] = a[i++]
    }
    while (j < b.size){
         result[k++] = b[j++]
    }

    return result
}

fun main() {
    val a = intArrayOf(10, 50, 20, 30, 70, 80, 40)
    val b = intArrayOf(25, 75, 5, 25)

    val res = mergeAlternate(a, b)
    for (num in res) print("$num ")
}