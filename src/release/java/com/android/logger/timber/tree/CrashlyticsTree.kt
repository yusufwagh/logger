package com.android.logger.timber.tree

import com.android.logger.core.LoggerBuilder
import com.android.logger.core.isLoggable
import timber.log.Timber

/**
 * This class is implementation of [Timber.Tree] and will print logs.
 * @param builder
 */
internal class CrashlyticsTree(private val builder: LoggerBuilder) : Timber.Tree() {

    override fun isLoggable(tag: String?, priority: Int): Boolean = builder.isLoggable(tag, priority)

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        //CrashlyticsLogs
    }
}