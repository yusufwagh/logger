package com.android.logger.timber.tree

import com.android.logger.core.LoggerBuilder
import com.android.logger.core.getTag
import com.android.logger.core.isLoggable
import timber.log.Timber

/**
 * This class is implementation of [Timber.DebugTree] and will print logs.
 * @param builder
 */
internal class DebugTree(private val builder: LoggerBuilder) : Timber.DebugTree() {
    override fun isLoggable(tag: String?, priority: Int): Boolean =
        builder.isLoggable(tag, priority)

    override fun createStackElementTag(element: StackTraceElement): String? {
        return getTag()
    }
}