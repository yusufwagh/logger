package com.android.logger.core

/**
 * Standard Logger functions.
 */
interface LoggerFramework {

    fun v(tag: String = "", message: String? = null, throwable: Throwable? = null)
    fun d(tag: String = "", message: String? = null, throwable: Throwable? = null)
    fun i(tag: String = "", message: String? = null, throwable: Throwable? = null)
    fun w(tag: String = "", message: String? = null, throwable: Throwable? = null)
    fun e(tag: String = "", message: String? = null, throwable: Throwable? = null)
    fun wtf(tag: String = "", message: String? = null, throwable: Throwable? = null)

}