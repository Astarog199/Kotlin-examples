package Examples.HTMLgeneration


open class Tag {

    protected val children = mutableListOf<Any>()

    fun b(callback: Tag.() -> Unit) {
        children.add(Bold().apply {
            callback()
        })
    }

    fun a(href: String, callback: Tag.() -> Unit) {
        children.add(Link(href).apply {
            callback()
        })
    }

    fun text(text: String) {
        children.add(text)
    }
}





