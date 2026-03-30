/*
Problem: Reverse each word in a string.

Input:
"Android is best"

Output:
"diordnA si tseb"
*/

fun reverseWord(word: String): String {
    val arr = word.toCharArray()
    var left = 0
    var right = arr.size - 1

    while (left < right) {
        val temp = arr[left]
        arr[left] = arr[right]
        arr[right] = temp
        left++
        right--
    }
    return String(arr)
}

fun reverseSentence(sentence: String): String {
    var result = ""
    var word = ""

    for (ch in sentence) {
        if (ch != ' ') {
            word += ch
        } else {
            result += reverseWord(word) + " "
            word = ""
        }
    }

    result += reverseWord(word)
    return result
}

fun main() {
    println(reverseSentence("Android is best"))
}