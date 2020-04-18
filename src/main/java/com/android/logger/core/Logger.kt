package com.android.logger.core

import android.app.Application
import android.content.Context

/**
 * Logger framework with standard logging functions.
 */
object Logger {

    private var loggerImpl = emptyList<LoggerFramework>()

    /**
     * Init function for the Logger.
     * This function should be called from Application class.
     * @param context
     * @param builder
     * @param handler
     */
    fun initialize(
        context: Context,
        builder: LoggerBuilder,
        handler: Thread.UncaughtExceptionHandler?
    ) {
        if (context !is Application) throw IllegalArgumentException("Init with Application Context")
        Thread.setDefaultUncaughtExceptionHandler(ExtendedUncaughtExceptionHandler(handler))
        loggerImpl = createLogger(context, builder)
    }

    @JvmStatic
    fun v(message: String) {
        loggerImpl.forEach {
            it.v(message = message)
        }
    }


    @JvmStatic
    fun v(tag: String, message: String) {
        loggerImpl.forEach {
            it.v(tag = tag, message = message)
        }
    }

    @JvmStatic
    fun v(message: String, throwable: Throwable) {
        loggerImpl.forEach {
            it.v(message = message, throwable = throwable)
        }
    }


    @JvmStatic
    fun v(throwable: Throwable) {
        loggerImpl.forEach {
            it.v(throwable = throwable)
        }
    }


    @JvmStatic
    fun v(tag: String, message: String, throwable: Throwable?) {
        loggerImpl.forEach {
            it.v(tag = tag, message = message, throwable = throwable)
        }
    }

    @JvmStatic
    fun d(message: String) {
        loggerImpl.forEach {
            it.d(message = message)
        }
    }

    @JvmStatic
    fun d(throwable: Throwable) {
        loggerImpl.forEach {
            it.d(throwable = throwable)
        }
    }

    @JvmStatic
    fun d(tag: String, message: String) {
        loggerImpl.forEach {
            it.d(tag = tag, message = message)
        }
    }


    @JvmStatic
    fun d(tag: String, message: String, throwable: Throwable) {
        loggerImpl.forEach {
            it.d(tag = tag, message = message, throwable = throwable)
        }
    }


    @JvmStatic
    fun i(message: String) {
        loggerImpl.forEach {
            it.i(message = message)
        }
    }

    @JvmStatic
    fun i(throwable: Throwable) {
        loggerImpl.forEach {
            it.i(throwable = throwable)
        }
    }

    @JvmStatic
    fun i(tag: String, message: String) {
        loggerImpl.forEach {
            it.i(tag = tag, message = message)
        }
    }

    @JvmStatic
    fun i(tag: String, message: String, throwable: Throwable?) {
        loggerImpl.forEach {
            it.i(tag = tag, message = message, throwable = throwable)
        }
    }

    @JvmStatic
    fun w(message: String) {
        loggerImpl.forEach {
            it.w(message = message)
        }
    }

    @JvmStatic
    fun w(throwable: Throwable) {
        loggerImpl.forEach {
            it.w(throwable = throwable)
        }
    }

    @JvmStatic
    fun w(tag: String, message: String) {
        loggerImpl.forEach {
            it.w(tag = tag, message = message)
        }
    }

    @JvmStatic
    fun w(tag: String, message: String, throwable: Throwable?) {
        loggerImpl.forEach {
            it.w(tag = tag, message = message, throwable = throwable)
        }
    }

    @JvmStatic
    fun e(message: String) {
        loggerImpl.forEach {
            it.e(message = message)
        }
    }

    @JvmStatic
    fun e(throwable: Throwable) {
        loggerImpl.forEach {
            it.e(throwable = throwable)
        }
    }

    @JvmStatic
    fun e(tag: String, message: String) {
        loggerImpl.forEach {
            it.e(tag = tag, message = message)
        }
    }

    @JvmStatic
    fun e(tag: String, message: String, throwable: Throwable?) {
        loggerImpl.forEach {
            it.e(tag = tag, message = message, throwable = throwable)
        }
    }

    @JvmStatic
    fun wtf(message: String) {
        loggerImpl.forEach {
            it.wtf(message = message)
        }
    }

    @JvmStatic
    fun wtf(throwable: Throwable) {
        loggerImpl.forEach {
            it.wtf(throwable = throwable)
        }
    }

    @JvmStatic
    fun wtf(tag: String, message: String) {
        loggerImpl.forEach {
            it.wtf(tag = tag, message = message)
        }
    }

    @JvmStatic
    fun wtf(tag: String, message: String, throwable: Throwable?) {
        loggerImpl.forEach {
            it.wtf(tag = tag, message = message, throwable = throwable)
        }
    }
}