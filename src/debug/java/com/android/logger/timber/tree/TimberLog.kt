package com.android.logger.timber.tree

import android.content.Context
import com.android.logger.core.LoggerBuilder
import com.android.logger.timber.TimberTree
import timber.log.Timber

/**
 * Create timber tree for the logger.
 */
class TimberLog : TimberTree {
    override fun createTreeList(context: Context?, builder: LoggerBuilder): List<Timber.Tree> {
        val trees = ArrayList<Timber.Tree>()
        trees.add(DebugTree(builder))
        takeIf { builder.isFileLoggingEnabled }?.run {
            context?.let {
                trees.add(
                    FileTree(
                        it,
                        builder
                    )
                )
            }
        }
        return trees
    }
}