package puzzler6

val x = listOf(1, 2, 3)
println(x is kotlin.collections.List<Int>)
println(x is kotlin.collections.MutableList)
println(x is java.util.List<*>)

// What will it print?
// a) true; true; false
// b) true; false; false
// c) false; false; true
// d) true; true; true
