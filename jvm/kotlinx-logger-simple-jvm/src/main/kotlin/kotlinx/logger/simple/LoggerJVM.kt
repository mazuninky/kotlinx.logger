package kotlinx.logger.simple

actual inline fun debug(message: () -> String) {
    System.out.println("DEBUG: ${message()}")
}

actual inline fun error(message: () -> String) {
    System.err.println("ERROR: ${message()}")
}

actual inline fun warning(message: () -> String) {
    System.out.println("WARNING: ${message()}")
}

actual inline fun verbose(message: () -> String) {
    System.out.println("VERBOSE: ${message()}")
}

actual inline fun information(message: () -> String) {
    System.out.println("INFORMATION: ${message()}")
}

actual inline fun wtf(message: () -> String) {
    System.out.println("WTF: ${message()}")
}