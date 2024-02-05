package TEST.Ex01

inline fun IntArray.foo(action: (Int) -> Unit){
    for (e in this) {
        action(e)
    }
}

fun main(){
    val a = intArrayOf(1,2,3)
    a.foo {
        if (it == 2) return
        println(it)
    }

}