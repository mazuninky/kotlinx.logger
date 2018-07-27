package kotlinx.logger

object Logger {
    private val writer = LogWriter()

    fun error(message: () -> String) {
        writer.log(LogLevel.Error, message())
    }

    inline fun e(noinline message: () -> String) {
        error(message)
    }

    fun debug(message: () -> String) {
        writer.log(LogLevel.Debug, message())
    }

    inline fun d(noinline message: () -> String) {
        debug(message)
    }

    fun warning(message: () -> String) {
        writer.log(LogLevel.Warning, message())
    }

    inline fun w(noinline message: () -> String) {
        warning(message)
    }

    fun verbose(message: () -> String) {
        writer.log(LogLevel.Verbose, message())
    }

    inline fun v(noinline message: () -> String) {
        verbose(message)
    }

    fun information(message: () -> String) {
        writer.log(LogLevel.Information, message())
    }

    inline fun i(noinline message: () -> String) {
        information(message)
    }

    fun wtf(message: () -> String) {
        writer.log(LogLevel.Wtf, message())
    }
}