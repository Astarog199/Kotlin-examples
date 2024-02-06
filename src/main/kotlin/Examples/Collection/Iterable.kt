package Examples.Collection

data class Entry(
    val city: String,
    val name: String,
    val age: Int
)

val entries = listOf(
    Entry("London", "Liam", 28),
    Entry("Berlin", "Oliver", 24),
    Entry("Madrid", "Oliver", 45),
    Entry("Berlin", "Jerry", 29),
    Entry("London", "Oliver", 19),
    Entry("Madrid", "Kate", 16),
    Entry("Berlin", "Oliver", 34),
    Entry("London", "Kate", 25),
    Entry("Berlin", "Oliver", 23),
    Entry("Milan", "Jerry", 28),
    Entry("Paris", "Charles", 44)
)

inline fun Iterable<Entry>.mfilter(action:(Entry) -> Boolean):List<Entry>{
    val filterList = ArrayList<Entry>()
    for (i in this){
        if(action(i)){
            filterList.add(i)
        }
    }
    return filterList
}

fun main() {
    val res = entries.mfilter { it.name == "Oliver" }
    for (i in res) {
        println("${i.name} in ${i.city}")
    }
}