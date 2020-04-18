package com.android.logger.timber.tree

import android.content.Context
import com.android.logger.core.LoggerBuilder
import com.android.logger.core.isLoggable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import timber.log.Timber
import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
import java.lang.Exception

/**
 * This class is implementation of [Timber.Tree] and will print logs.
 * @param builder
 */
internal class FileTree(private val context: Context, private val builder: LoggerBuilder) :
    Timber.Tree() {

    override fun isLoggable(tag: String?, priority: Int): Boolean =
        builder.isLoggable(tag, priority)

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        try {
            GlobalScope.launch(Dispatchers.IO) {
                val fileName = "Log.txt"
                getFile(fileName).run {
                    val writer = FileWriter(this, true)
                    tag?.let { writer.write("Tag = $tag : ") }
                    writer
                        .append("Priority = $priority : ")
                        .append(message)

                    t?.let { writer.write(it.localizedMessage) }
                    writer.write(System.getProperty( "line.separator" ))
                    writer.flush()
                    writer.close()

                }
            }
        } catch (_: Exception) {

        }

    }


    private fun getFile(name: String): File {
        val logFile = File(context.noBackupFilesDir, name)
        return logFile.takeIf { (it.length() / 1024 / 1024) >= 2 }?.run {
            val writer = PrintWriter(logFile)
            writer.print("")
            writer.close()
            logFile
        } ?: run { logFile }
    }

}