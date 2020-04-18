package com.android.logger.timber

import android.content.Context
import com.android.logger.core.LoggerBuilder
import timber.log.Timber

/**
 * Interface for Timber tree implementation.
 */
interface TimberTree {
    fun createTreeList(context: Context?, builder: LoggerBuilder) : List<Timber.Tree>
}