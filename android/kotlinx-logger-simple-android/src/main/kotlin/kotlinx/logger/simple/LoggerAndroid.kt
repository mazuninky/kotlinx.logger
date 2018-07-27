package kotlinx.logger.simple

import android.util.Log

actual inline fun debug(message: () -> String) {
    Log.d("DEBUG", message())
}

actual inline fun error(message: () -> String) {
    Log.e("ERROR", message())
}

actual inline fun warning(message: () -> String) {
    Log.w("WARNING", message())
}

actual inline fun verbose(message: () -> String) {
    Log.v("VERBOSE", message())
}

actual inline fun information(message: () -> String) {
    Log.i("INFORMATION", message())
}

actual inline fun wtf(message: () -> String) {
    Log.wtf("WTF", message())
}