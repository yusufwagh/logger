package com.android.logger.core

class ExtendedUncaughtExceptionHandler(val handler: Thread.UncaughtExceptionHandler?) : Thread.UncaughtExceptionHandler {
    override fun uncaughtException(thread: Thread?, throwable: Throwable?) {
        throwable?.let { Logger.wtf(throwable = throwable) }
        handler?.uncaughtException(thread, throwable)
    }
}