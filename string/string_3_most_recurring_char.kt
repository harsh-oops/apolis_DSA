// Find most recurring character

// Input:  "ajhladhfiwbvabvsalkbds"
// Output: 
// Most recurring char: a
// Occurrences: 4



fun main() {
   val text = "ajhladhfiwbvabvsalkbds"
    val map = mutableMapOf<Char, Int>()

    for (ch in text) {
        map[ch] = map.getOrDefault(ch, 0) + 1
    }

    var maxChar = ' '
    var maxCount = 0

    for ((char, count) in map) {
        if (count > maxCount) {
            maxCount = count
            maxChar = char
        }
    }

    println("Most recurring char: $maxChar")
    println("Occurrences: $maxCount")
}