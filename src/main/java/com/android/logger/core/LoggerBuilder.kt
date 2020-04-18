package com.android.logger.core

/**
 * Builder Class to define setting for Logger
 */
data class LoggerBuilder(
    val tags: List<String>,
    val priorities: List<Int>,
    val isFileLoggingEnabled: Boolean
) {
    class Builder {
        private val tags = ArrayList<String>()

        private val priorities = ArrayList<Int>()

        private var isFileLoggingEnabled = true

        /**
         * Set tag if filtering is needed. By default all tags will be printed.
         */
        fun tag(tag: String) = apply { tags.add(tag) }
        /**
         * Set priority if filtering is needed. By default all priority will be printed.
         */
        fun priority(priority: Int) = apply { priorities.add(priority) }

        fun setFileLogging(isFileLoggingEnabled: Boolean) = apply { this.isFileLoggingEnabled = isFileLoggingEnabled }

        fun build() = LoggerBuilder(tags, priorities, isFileLoggingEnabled)
    }

}