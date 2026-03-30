/*
Problem: Merge two sorted arrays into one sorted array.

Input:
A = [10, 28, 50, 75, 80, 95, 100]
B = [35, 60, 70, 78]

Output:
[10, 28, 35, 50, 60, 70, 75, 78, 80, 95, 100]
*/

fun mergeSorted(a: IntArray, b: IntArray): IntArray {
    val result = IntArray(a.size + b.size)

    var i = 0
    var j = 0
    var k = 0

    while (i < a.size && j < b.size) {
        if (a[i] < b[j]) {
            result[k++] = a[i++]
        } else {
            result[k++] = b[j++]
        }
    }

    while (i < a.size) {
        result[k++] = a[i++]
    }
    while (j < b.size) {
        result[k++] = b[j++]
    }

    return result
}

fun main() {
    val a = intArrayOf(10, 28, 50, 75, 80, 95, 100)
    val b = intArrayOf(35, 60, 70, 78)

    val res = mergeSorted(a, b)
    for (num in res) print("$num ")
}