package kotlinx.logger.simple

actual inline fun debug(message: () -> String) {
    println("DEBUG: ${message()}")
}

actual inline fun error(message: () -> String) {
    println("ERROR: ${message()}")
}

actual inline fun warning(message: () -> String) {
    println("WARNING: ${message()}")
}

actual inline fun verbose(message: () -> String) {
    println("VERBOSE: ${message()}")
}

actual inline fun information(message: () -> String) {
    println("INFORMATION: ${message()}")
}

actual inline fun wtf(message: () -> String) {
    println("WTF: ${message()}")
}