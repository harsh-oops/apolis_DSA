/*
Problem: Remove consecutive duplicate characters.

Input:
"ssuuppperrrrr coooommpuuuuuuuuttttter"

Output:
"super computer"
*/

fun removeDuplicates(str: String): String {
    if (str.isEmpty()) return str

    var result = "" + str[0]

    for (i in 1 until str.length) {
        if (str[i] != str[i - 1]) {
            result += str[i]
        }
    }

    return result
}

fun main() {
    println(removeDuplicates("ssuuppperrrrr coooommpuuuuuuuuttttter"))
}