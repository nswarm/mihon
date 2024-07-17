package eu.kanade.tachiyomi.ui.reader.model

data class ReaderDoublePage(
    var first: ReaderPage,
    var second: ReaderPage?,
) {
    val chapter: ReaderChapter = first.chapter

    public fun swapPages() {
        if (second == null) {
            return
        }
        val temp = second as ReaderPage
        second = first
        first = temp
    }
}
