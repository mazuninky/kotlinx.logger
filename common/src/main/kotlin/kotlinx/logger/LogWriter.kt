package kotlinx.logger

expect class LogWriter() {
    fun error(tag: String, message: String)
}