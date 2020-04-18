package com.android.logger.core

import java.util.regex.Pattern


/**
 * This function will return weather log is loggable on or not.
 * If [LoggerBuilder.tags] and [LoggerBuilder.priorities] are empty all will be printed.
 * else only logs which satisfy [LoggerBuilder.tags] and [LoggerBuilder.priorities] will be printed.
 * @param tag
 * @param priority
 * @return isLoggable
 */
internal inline fun LoggerBuilder.isLoggable(tag: String?, priority: Int): Boolean {
    return when {
        tags.isNotEmpty() && priorities.isNotEmpty() -> tags.contains(tag) && priorities.contains(
            priority
        )
        tags.isNotEmpty() -> tags.contains(tag)
        priorities.isNotEmpty() -> priorities.contains(priority)
        else -> true
    }
}


internal inline fun getTag(): String? {
    val index =
        if (Thread.currentThread().stackTrace.size >= 11) 11 else Thread.currentThread().stackTrace.size - 1
    val element = Thread.currentThread().stackTrace[index]
    var tag = element.className
    val m = Pattern.compile("(\\$\\d+)+$").matcher(tag)
    if (m.find()) {
        tag = m.replaceAll("")
    }
    tag = tag.substring(tag.lastIndexOf('.') + 1)
    tag = tag + ":" + element.methodName + ":" + element.lineNumber
    return tag
}