// Check if a String is Palindrome (without reversing)

// Input:  "ffafafasfsa"
// Output: Not Palindrome


// Input:  "aaaaaaaaaa"
// Output: Palindrome


fun isPalindrome(str: String): Boolean {
    var left = 0
    var right = str.length - 1

    while (left < right) {
        if (str[left] != str[right]) {
            return false
        }
        left++
        right--
    }
    return true
}

fun main() {
    var text = "aaaaaaaaaa"

    if (isPalindrome(text))
        println("Palindrome")
    else
        println("Not Palindrome")

     text = "ffafafasfsa"

    if (isPalindrome(text))
        println("Palindrome")
    else
        println("Not Palindrome")
}