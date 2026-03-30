/*
Problem: Find the second smallest number in an array.

Input:
[10, 20, 4, 45, 99]

Output:
10
*/

fun secondSmallest(arr: IntArray): Int {
    var smallest = Int.MAX_VALUE
    var second = Int.MAX_VALUE

    for (num in arr) {
        if (num < smallest) {
            second = smallest
            smallest = num
        } else if (num < second && num != smallest) {
            second = num
        }
    }
    return second
}

fun main() {
    val arr = intArrayOf(10, 20, 4, 45, 99)
    println(secondSmallest(arr))
}