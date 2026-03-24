
// Input:
// programming

// Output:
// r, g, m


fun main() {
    val s = readLine()!!
    val map = mutableMapOf<Char, Int>()

    for (c in s) {
        map[c] = map.getOrDefault(c, 0) + 1
    } 

    val result = map.filter { it.value > 1 }.keys
    println(result.joinToString(", "))
}