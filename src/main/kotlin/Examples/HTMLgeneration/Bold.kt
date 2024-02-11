package Examples.HTMLgeneration

class Bold : Tag() {
    override fun toString(): String {
        return "<b>${children.joinToString("")}</b>"
    }
}