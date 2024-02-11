package Examples.HTMLgeneration

class Html {

    private val headBuilder = Head()
    private val _body = Body()

    fun head(callback: Head.() -> Unit) {
        headBuilder.callback()
    }

    fun body(callback: Body.() -> Unit) {
        _body.callback()
    }

    override fun toString(): String {
        return "<page.html>$headBuilder$_body</page.html>"
    }
}