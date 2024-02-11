package Examples.HTMLgeneration

class Head {

    private var titleValue: String? = null

    fun title(titleValue: String) {
        this.titleValue = titleValue
    }

    override fun toString(): String {
        val titleTag = titleValue?.let {
            "<title>$it</title>"
        } ?: ""
        return "<head>$titleTag</head>"
    }
}