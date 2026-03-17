// Implement Non-Recursive Binary Search
// Input: [1,3,5,7,9], target = 7
// Output: index 3

fun binarySearch(arr: Array<Int>, target: Int): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
        val mid = (left + right) / 2

        if (arr[mid] == target) {
            return mid
        } else if (arr[mid] < target) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    return -1
}

fun main() {
    val arr = arrayOf(1, 3, 5, 7, 9)
    val target = 7

    val result = binarySearch(arr, target)
    println("Index: $result")
}