/*
Problem: Rotate array left by N positions.

Input:
[1, 2, 3, 4, 5], N = 2

Output:
[3, 4, 5, 1, 2]
*/

fun rotateLeft(arr: IntArray, n: Int): IntArray {
    val size = arr.size
    val result = IntArray(size)

    for (i in 0 until size) {
        result[i] = arr[(i + n) % size]
    }

    return result
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val res = rotateLeft(arr, 2)

    for (num in res) print("$num ")
}