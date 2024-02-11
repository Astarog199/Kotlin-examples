package Examples.HTMLgeneration

class ListItem : Tag() {

    override fun toString(): String {
        return "<li>${children.joinToString("")}</li>"
    }
}