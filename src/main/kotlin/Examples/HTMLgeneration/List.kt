package Examples.HTMLgeneration

class List {

    private val children = mutableListOf<Any>()

    fun li(callback: ListItem.() -> Unit) {
        children.add(ListItem().apply(callback))
    }

    override fun toString(): String {
        return "<ul>${children.joinToString("")}</ul>"
    }
}