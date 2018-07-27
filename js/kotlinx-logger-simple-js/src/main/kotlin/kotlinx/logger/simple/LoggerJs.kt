package kotlinx.logger.simple

actual inline fun debug(message: () -> String) {
    console.log("DEBUG: ${message()}")
}

actual inline fun error(message: () -> String) {
    console.log("ERROR: ${message()}")
}

actual inline fun warning(message: () -> String) {
    console.log("WARNING: ${message()}")
}

actual inline fun verbose(message: () -> String) {
    console.log("VERBOSE: ${message()}")
}

actual inline fun information(message: () -> String) {
    console.log("INFORMATION: ${message()}")
}

actual inline fun wtf(message: () -> String) {
    console.log("WTF: ${message()}")
}