package types.typeConversion

val x: Any = "123"
val z = if (x is Int && x is String) x.length + x.inc() else 123

println(z)

// What will it print?
// a) 123
// b) 127
// c) ClassCastException
// d) will not compile