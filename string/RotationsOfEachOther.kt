/*
Problem: Check if two strings are rotations of each other.

Input:
str1 = "ABCD"
str2 = "CDAB"

Output:
true
*/

fun areRotations(str1: String, str2: String): Boolean {
    return str1.length == str2.length && (str1 + str1).contains(str2)
}

fun main() {
    val str1 = "ABCD"
    val str2 = "CDAB"
    println(areRotations(str1, str2))
}