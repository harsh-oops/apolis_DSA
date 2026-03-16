// Implement Linear Search
// Input: [4,2,7,1,9], target = 7
// Output: index 2


fun linearSearch(arr: Array<Int>, target: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == target) {
            return i
        }
    }
    return -1
}

fun main() {
    val arr = arrayOf(4, 2, 7, 1, 9)
    val target = 7
    val result = linearSearch(arr, target)

    println("Index: $result")
}