/*
Problem: Find the second largest number in an array.

Input:
[10, 20, 4, 45, 99]

Output:
45
*/

fun secondLargest(arr: IntArray): Int {
    var largest = Int.MIN_VALUE
    var second = Int.MIN_VALUE

    for (num in arr) {
        if (num > largest) {
            second = largest
            largest = num
        } else if (num > second && num != largest) {
            second = num
        }
    }
    return second
}

fun main() {
    val arr = intArrayOf(10, 20, 4, 45, 99)
    println(secondLargest(arr))
}