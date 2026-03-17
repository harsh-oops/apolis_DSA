// Insertion Sort
// Input:  [12, 11, 13, 5, 6]
// Output: [5, 6, 11, 12, 13]

fun insertionSort(arr: Array<Int>): Array<Int>{
    for (i in 1 until arr.size ){
        
        val key = arr[i]
        var j = i - 1

        while( j>=0 && key < arr[j]){
            arr[j+1] = arr[j]
            j--
        }

        arr[j+1] = key
        
    }

    return arr
}

fun main(){
    val arr = arrayOf(12, 11, 13, 5, 6)
    val sorted = insertionSort(arr)
    println(sorted.joinToString(", ", "[", "]"))
}