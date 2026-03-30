/*
Problem: Find first pair of elements with sum = 0.

Input:
[2, -3, 1, 4, -1, 3]

Output:
(-3, 3)
*/

fun findPairWithZeroSum(arr: IntArray) {
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] + arr[j] == 0) {
                println("(${arr[i]}, ${arr[j]})")
                return
            }
        }
    }
    println("No pair found")
}

fun main() {
    val arr = intArrayOf(2, -3, 1, 4, -1, 3)
    findPairWithZeroSum(arr)
}