
// Input:
// programming

// Output:
// p


fun main() {
    val s = readLine()!!
    val map = mutableMapOf<Char, Int>()

    for (c in s) {
        map[c] = map.getOrDefault(c, 0) + 1
    }

    for (c in s) {
        if (map[c] == 1) {
            println(c)
            return
        }
    }

    println("None")
}