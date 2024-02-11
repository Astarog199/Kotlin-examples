package TEST.Ex02

import Examples.HTMLgeneration.Html

data class Item(
    val text: String,
    val url: String?
)

fun main() {

    val items = listOf(
        Item("Item 1", "http://example.com"),
        Item("Item 2", "http://google.com")
    )

    val htmlPage = html {
        head {
            title("Page title")
        }

        body {

            ul {
                for (item in items) {
                    li {
                        if (item.url != null) {
                            a(href = item.url) {
                                text(item.text)
                            }
                        } else {
                            text(item.text)
                        }
                    }
                }
            }


            b {
                a(href = "http://google.com") {
                    text("Google it")
                }
            }
        }
    }

    println(htmlPage)
}

fun html(callback: Html.() -> Unit): Html {
    val builder = Html()
    builder.callback()
    return builder
}

