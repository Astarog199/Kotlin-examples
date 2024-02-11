package Examples.HTMLgeneration

class Link(private val url: String): Tag() {
    override fun toString(): String {
        return "<a href = \"$url\"> ${children.joinToString("")} </a>"
    }
}