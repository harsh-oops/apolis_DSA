/*
Problem: Find the longest word in a sentence.

Input:
"Kotlin is a powerful programming language"

Output:
"programming"
*/

fun longestWord(sentence: String): String {
    var maxWord = ""
    var current = ""

    for (ch in sentence) {
        if (ch != ' ') {
            current += ch
        } else {
            if (current.length > maxWord.length) {
                maxWord = current
            }
            current = ""
        }
    }

    if (current.length > maxWord.length) {
        maxWord = current
    }

    return maxWord
}

fun main() {
    println(longestWord("Kotlin is a powerful programming language"))
}