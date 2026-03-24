/*
Input:
hello world
world

Output:
he 
*/

fun main() {
    val s1 = readLine()!!
    val s2 = readLine()!!

    val set = s2.toSet()
    val result = s1.filter { it !in set }

    println(result)
}