

// Remove duplicate characters

// Input:  "ajhladhfiwbvabvsalkbds"
// Output: "ajhldfiwbvsk"


fun main() {
   val text = "ajhladhfiwbvabvsalkbds"
    val map = mutableMapOf<Char, Int>()

    for (ch in text) {
        map[ch] = map.getOrDefault(ch, 0) + 1
    }
   
    var ans = ""
    for ((char, _) in map) {
        ans += char
    }

    println(ans)
}