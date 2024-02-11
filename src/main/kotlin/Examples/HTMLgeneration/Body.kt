package Examples.HTMLgeneration



class Body : Tag() {

    fun ul(callback: List.() -> Unit) {
        children.add(List().apply(callback))
    }

    override fun toString(): String {
        return "<body>${children.joinToString("")}</body>"
    }
}