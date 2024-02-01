package Examples.Functions.LambdaExpressions

val add = {a: Int, b: Int -> a+b}
val add2 = {a: Int, b: Int ->
    print("Calculating: $a + $b = ")
    a+b
}
val add3 : (Int,Int) -> Int = {a, b -> a+b}