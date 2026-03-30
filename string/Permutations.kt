/*
Problem: Print all permutations of a given string.

Input:
"ABC"

Output:
ABC ACB BAC BCA CAB CBA
*/

fun permute(str: String, prefix: String = "") {
    if (str.isEmpty()) {
        print("$prefix ")
        return
    }
    for (i in str.indices) {
        permute(
            str.substring(0, i) + str.substring(i + 1),
            prefix + str[i]
        )
    }
}

fun main() {
    permute("ABC")
}