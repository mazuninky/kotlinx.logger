package kotlinx.logger

expect class LogWriter() {
    fun log(level: LogLevel, message: String)
}