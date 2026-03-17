// Bubble Sort
// Input:  [5, 1, 4, 2, 8]
// Output: [1, 2, 4, 5, 8]

fun bubbleSort(arr: Array<Int>): Array<Int>{
    for (i in 0 until arr.size - 1){
        
        for (j in 0 until arr.size - i - 1){
            
            if(arr[j] > arr[j+1]){
                val tmp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = tmp
            }
        }
    }

    return arr
}

fun main(){
    val arr = arrayOf(5, 1, 4, 2, 8)
    val sorted = bubbleSort(arr)

    println(sorted.joinToString(", ", "[", "]"))
}