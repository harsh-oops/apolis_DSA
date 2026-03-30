/*
Problem: Rotate array right by N positions.

Input:
[1, 2, 3, 4, 5], N = 2

Output:
[4, 5, 1, 2, 3]
*/

fun rotateRight(arr: IntArray, n: Int): IntArray {
    val size = arr.size
    val result = IntArray(size)

    for (i in 0 until size) {
        result[(i + n) % size] = arr[i]
    }

    return result
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val res = rotateRight(arr, 2)

    for (num in res) print("$num ")
}