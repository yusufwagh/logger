package com.android.logger.timber.tree

import android.content.Context
import com.android.logger.core.LoggerBuilder
import com.android.logger.timber.TimberTree
import timber.log.Timber

class TimberLog : TimberTree {
    override fun createTreeList(context: Context?, builder: LoggerBuilder): List<Timber.Tree> {
        return listOf(CrashlyticsTree(builder))
    }

}