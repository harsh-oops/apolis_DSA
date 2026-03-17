// Selection Sort
// Input:  [29, 10, 14, 37, 13]
// Output: [10, 13, 14, 29, 37]

fun selectionSort(arr: Array<Int>): Array<Int>{
    for (i in arr.indices){
        var minI = i

        for (j in i+1 until arr.size){
            if(arr[minI] > arr[j]){
                minI = j
            }
        }

        val tmp = arr[i]
        arr[i] = arr[minI]
        arr[minI] = tmp

    }

    return arr
}

fun main(){
    val arr = arrayOf(29, 10, 14, 37, 13)
    val sorted = selectionSort(arr)

    println(sorted.joinToString(", ", "[", "]"))
}