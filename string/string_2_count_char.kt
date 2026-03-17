// Count occurrences of each character

// Input:  "programming"
// Output:
// h -> 2
// a -> 2
// r -> 1
// s -> 1
//   -> 1
// p -> 1
// t -> 1
// e -> 1
// l -> 1


fun main() {
    val text = "harsh patel"
    val map = mutableMapOf<Char, Int>()

    for (ch in text) {
        map[ch] = map.getOrDefault(ch, 0) + 1
    }

    for ((char, count) in map) {
        println("$char -> $count")
    }
}