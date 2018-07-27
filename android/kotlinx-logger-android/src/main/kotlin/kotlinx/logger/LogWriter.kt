package kotlinx.logger

actual class LogWriter actual constructor() {
   actual fun log(level: LogLevel, message: String) {
        System.err.println(message)
    }
}
