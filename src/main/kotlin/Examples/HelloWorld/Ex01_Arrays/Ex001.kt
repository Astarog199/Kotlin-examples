package Examples.HelloWorld.Ex01_Arrays
fun main() {
    //Массивы примитивных типов
//        ByteArray
//        ShortArray
//        IntArray
//        LongArray
//        FloatArray
//        DoubleArray
//        CharArray
//        BooleanArray

    val a:  IntArray = intArrayOf(1,2,3);
    val size = a.size
    val first = a[0]
    println(size)
    println(first)
    println()

    val b: IntArray = IntArray(3)
    b.fill(0) //заполняет массив нулями
    b[0] = 1
    b[1] = 2
    b[2] = 3

    println(b[0])
    println(b[1])
    println(b[2])
}