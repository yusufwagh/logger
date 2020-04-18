package com.android.logger.timber

import android.content.Context
import com.android.logger.core.LoggerBuilder
import com.android.logger.core.LoggerFramework
import com.android.logger.timber.tree.TimberLog
import timber.log.Timber


/**
 * Timber implementation of the logger.
 */
class TimberFramework(context: Context?, builder: LoggerBuilder) : LoggerFramework {

    private val timberTree = TimberLog()

    init {
        //Plant timber trees
        timberTree.createTreeList(context, builder).forEach {
            Timber.plant(it)
        }
    }

    override fun v(tag: String, message: String?, throwable: Throwable?) {
        tag.setTag()
        if (throwable != null) {
            Timber.v(throwable, message)
        } else {
            Timber.v(message)
        }
    }

    override fun d(tag: String, message: String?, throwable: Throwable?) {
        tag.setTag()
        if (throwable != null) {
            Timber.d(throwable, message)
        } else {
            Timber.d(message)
        }
    }

    override fun i(tag: String, message: String?, throwable: Throwable?) {
        tag.setTag()
        if (throwable != null) {
            Timber.i(throwable, message)
        } else {
            Timber.i(message)
        }
    }

    override fun w(tag: String, message: String?, throwable: Throwable?) {
        tag.setTag()
        if (throwable != null) {
            Timber.w(throwable, message)
        } else {
            Timber.w(message)
        }
    }

    override fun e(tag: String, message: String?, throwable: Throwable?) {
        tag.setTag()
        if (throwable != null) {
            Timber.e(throwable, message)
        } else {
            Timber.e(message)
        }
    }

    override fun wtf(tag: String, message: String?, throwable: Throwable?) {
        tag.setTag()
        if (throwable != null) {
            Timber.wtf(throwable, message)
        } else {
            Timber.wtf(message)
        }
    }

    private fun String.setTag() {
        if (this.isNotEmpty())
            Timber.tag(this)
    }
}