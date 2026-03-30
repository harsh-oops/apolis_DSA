/*
Problem: Group anagram strings.

Input:
["act", "race", "listen", "silent", "hello", "cat", "tac"]

Output:
[[act, cat, tac], [race], [listen, silent], [hello]]
*/

fun getKey(word: String): String {
    val count = IntArray(26)

    for (ch in word) {
        count[ch - 'a']++
    }

    var key = ""
    for (i in 0 until 26) {
        key += "#" + count[i]
    }
    return key
}

fun groupAnagrams(words: Array<String>) {
    val map = HashMap<String, MutableList<String>>()

    for (word in words) {
        val key = getKey(word)

        if (!map.containsKey(key)) {
            map[key] = mutableListOf()
        }
        map[key]!!.add(word)
    }

    for (entry in map.values) {
        println(entry)
    }
}

fun main() {
    val input = arrayOf("act", "race", "listen", "silent", "hello", "cat", "tac")
    groupAnagrams(input)
}