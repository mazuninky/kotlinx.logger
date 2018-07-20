package kotlinx.logger

actual class LogWriter actual constructor() {
    actual fun error(tag: String, message: String) {
        System.err.println("$tag: $message")
    }
}
