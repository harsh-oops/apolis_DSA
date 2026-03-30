/*
Problem: Check if two strings are anagrams.

Input:
str1 = "listen"
str2 = "silent"

Output:
true
*/

fun areAnagrams(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false

    val count = IntArray(256)

    for (ch in str1) {
        count[ch.code]++
    }

    for (ch in str2) {
        count[ch.code]--
    }

    for (i in count) {
        if (i != 0) return false
    }

    return true
}

fun main() {
    println(areAnagrams("listen", "silent"))
}