/*
Problem: Find index where left sum equals right sum.

Input:
[1, 3, 5, 2, 2]

Output:
2
*/

fun equilibriumIndex(arr: IntArray): Int {
    var totalSum = 0
    for (num in arr) totalSum += num

    var leftSum = 0

    for (i in arr.indices) {
        totalSum -= arr[i]

        if (leftSum == totalSum) return i

        leftSum += arr[i]
    }

    return -1
}

fun main() {
    val arr = intArrayOf(1, 3, 5, 2, 2)
    println(equilibriumIndex(arr))
}