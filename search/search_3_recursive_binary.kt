// Implement Recursive Binary Search
// Input: [2,4,6,8,10], target = 6
// Output: index 2

fun recursiveBinarySearch(arr: Array<Int>, target: Int, left: Int, right: Int): Int {

    if (left > right) return -1

    val mid = (left + right) / 2

    return when {
        arr[mid]==target -> mid
        arr[mid] > target -> recursiveBinarySearch(arr, target, left, mid-1)
        else -> recursiveBinarySearch(arr,target, mid+1, right)
    }
}

fun main() {
    val arr = arrayOf(2, 4, 6, 8, 10)
    val target = 6

    val result = recursiveBinarySearch(arr, target, 0, arr.size - 1)
    println("Index: $result")
}