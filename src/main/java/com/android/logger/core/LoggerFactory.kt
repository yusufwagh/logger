package com.android.logger.core

import android.content.Context
import com.android.logger.timber.TimberFramework

/**
 * This function will create and add loggers.
 * Multiple loggers can be added.
 * By default timber logger is added.
 * @param context
 * @param builder
 * @return List<LoggerFramework>
 */
internal inline fun createLogger(context: Context?, builder: LoggerBuilder): List<LoggerFramework> {
    val loggerFrameworks = ArrayList<LoggerFramework>()
    loggerFrameworks.add(TimberFramework(context, builder))
    return loggerFrameworks
}