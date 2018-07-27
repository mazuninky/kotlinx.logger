@file:Suppress("NOTHING_TO_INLINE")

package kotlinx.logger.simple

expect inline fun debug(message: () -> String)

expect inline fun error(message: () -> String)

expect inline fun warning(message: () -> String)

expect inline fun verbose(message: () -> String)

expect inline fun information(message: () -> String)

expect inline fun wtf(message: () -> String)

inline fun handleLog(level: LogLevel, noinline message: () -> String) {
    when (level) {
        LogLevel.Debug -> debug(message)
        LogLevel.Error -> error(message)
        LogLevel.Verbose -> verbose(message)
        LogLevel.Information -> information(message)
        LogLevel.Warning -> warning(message)
        LogLevel.Wtf -> wtf(message)
    }
}

inline fun d(noinline message: () -> String) {
    debug(message)
}

inline fun e(noinline message: () -> String) {
    error(message)
}

inline fun w(noinline message: () -> String) {
    warning(message)
}

inline fun v(noinline message: () -> String) {
    verbose(message)
}

inline fun i(noinline message: () -> String) {
    information(message)
}