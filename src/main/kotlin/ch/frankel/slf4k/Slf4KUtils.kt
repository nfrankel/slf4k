package ch.frankel.slf4k

import org.slf4j.Logger
import org.slf4j.Marker

inline fun Logger.trace(format: () -> String) {
    if (isTraceEnabled) trace(format.invoke())
}

inline fun Logger.debug(format: () -> String) {
    if (isDebugEnabled) debug(format.invoke())
}

inline fun Logger.info(format: () -> String) {
    if (isInfoEnabled) info(format.invoke())
}

inline fun Logger.warn(format: () -> String) {
    if (isWarnEnabled) warn(format.invoke())
}

inline fun Logger.error(format: () -> String) {
    if (isErrorEnabled) error(format.invoke())
}

inline fun Logger.trace(marker: Marker, format: () -> String) {
    if (isTraceEnabled(marker)) trace(format.invoke())
}

inline fun Logger.debug(marker: Marker, format: () -> String) {
    if (isDebugEnabled(marker)) debug(format.invoke())
}

inline fun Logger.info(marker: Marker, format: () -> String) {
    if (isInfoEnabled(marker)) info(format.invoke())
}

inline fun Logger.warn(marker: Marker, format: () -> String) {
    if (isWarnEnabled(marker)) warn(format.invoke())
}

inline fun Logger.error(marker: Marker, format: () -> String) {
    if (isErrorEnabled(marker)) error(format.invoke())
}

inline fun Logger.trace(format: String, arg: () -> Any) {
    if (isTraceEnabled) trace(format, arg.invoke())
}

inline fun Logger.debug(format: String, arg: () -> Any) {
    if (isDebugEnabled) debug(format, arg.invoke())
}

inline fun Logger.info(format:  String, arg: () -> Any) {
    if (isInfoEnabled) info(format, arg.invoke())
}

inline fun Logger.warn(format:  String, arg: () -> Any) {
    if (isWarnEnabled) warn(format, arg.invoke())
}

inline fun Logger.error(format: String, arg: () -> Any) {
    if (isErrorEnabled) error(format, arg.invoke())
}

inline fun Logger.trace(marker: Marker, format: String, arg: () -> Any) {
    if (isTraceEnabled(marker)) trace(format, arg.invoke())
}

inline fun Logger.debug(marker: Marker, format: String, arg: () -> Any) {
    if (isDebugEnabled(marker)) debug(format, arg.invoke())
}

inline fun Logger.info(marker: Marker, format: String, arg: () -> Any) {
    if (isInfoEnabled(marker)) info(format, arg.invoke())
}

inline fun Logger.warn(marker: Marker, format: String, arg: () -> Any) {
    if (isWarnEnabled(marker)) warn(format, arg.invoke())
}

inline fun Logger.error(marker: Marker, format: String, arg: () -> Any) {
    if (isErrorEnabled(marker)) error(format, arg.invoke())
}

inline fun Logger.trace(format: String, arg1: () -> Any, arg2: () -> Any) {
    if (isTraceEnabled) trace(format, arg1.invoke(), arg2.invoke())
}

inline fun Logger.debug(format: String, arg1: () -> Any, arg2: () -> Any) {
    if (isDebugEnabled) debug(format, arg1.invoke(), arg2.invoke())
}

inline fun Logger.info(format: String, arg1: () -> Any, arg2: () -> Any) {
    if (isInfoEnabled) info(format, arg1.invoke(), arg2.invoke())
}

inline fun Logger.warn(format: String, arg1: () -> Any, arg2: () -> Any) {
    if (isWarnEnabled) warn(format, arg1.invoke(), arg2.invoke())
}

inline fun Logger.error(format: String, arg1: () -> Any, arg2: () -> Any) {
    if (isErrorEnabled) error(format, arg1.invoke(), arg2.invoke())
}

inline fun Logger.trace(marker: Marker, format: String, arg1: () -> Any, arg2: () -> Any) {
    if (isTraceEnabled(marker)) trace(format, arg1.invoke(), arg2.invoke())
}

inline fun Logger.debug(marker: Marker, format: String, arg1: () -> Any, arg2: () -> Any) {
    if (isDebugEnabled(marker)) debug(format, arg1.invoke(), arg2.invoke())
}

inline fun Logger.info(marker: Marker, format: String, arg1: () -> Any, arg2: () -> Any) {
    if (isInfoEnabled(marker)) info(format, arg1.invoke(), arg2.invoke())
}

inline fun Logger.warn(marker: Marker, format: String, arg1: () -> Any, arg2: () -> Any) {
    if (isWarnEnabled(marker)) warn(format, arg1.invoke(), arg2.invoke())
}

inline fun Logger.error(marker: Marker, format: String, arg1: () -> Any, arg2: () -> Any) {
    if (isErrorEnabled(marker)) error(format, arg1.invoke(), arg2.invoke())
}

inline fun Logger.trace(format: String, vararg arguments: () -> Any) {
    if (isTraceEnabled) trace(format, arguments.map { it.invoke() } )
}

inline fun Logger.debug(format: String, vararg arguments: () -> Any) {
    if (isDebugEnabled) debug(format, arguments.map { it.invoke() })
}

inline fun Logger.info(format: String, vararg arguments: () -> Any) {
    if (isInfoEnabled) info(format, arguments.map { it.invoke() })
}

inline fun Logger.warn(format: String, vararg arguments: () -> Any) {
    if (isWarnEnabled) warn(format, arguments.map { it.invoke() })
}

inline fun Logger.error(format: String, vararg arguments: () -> Any) {
    if (isErrorEnabled) error(format, arguments.map { it.invoke() })
}

inline fun Logger.trace(marker: Marker, format: String, vararg arguments: () -> Any) {
    if (isTraceEnabled(marker)) trace(format, arguments.map { it.invoke() })
}

inline fun Logger.debug(marker: Marker, format: String, vararg arguments: () -> Any) {
    if (isDebugEnabled(marker)) debug(format, arguments.map { it.invoke() })
}

inline fun Logger.info(marker: Marker, format: String, vararg arguments: () -> Any) {
    if (isInfoEnabled(marker)) info(format, arguments.map { it.invoke() })
}

inline fun Logger.warn(marker: Marker, format: String, vararg arguments: () -> Any) {
    if (isWarnEnabled(marker)) warn(format, arguments.map { it.invoke() })
}

inline fun Logger.error(marker: Marker, format: String, vararg arguments: () -> Any) {
    if (isErrorEnabled(marker)) error(format, arguments.map { it.invoke() })
}