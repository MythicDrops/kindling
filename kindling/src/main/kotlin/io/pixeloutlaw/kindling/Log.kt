package io.pixeloutlaw.kindling

/**
 * Sends log messages to all registered [Logger]s.
 */
public object Log {
    public enum class Level {
        VERBOSE,
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        ASSERT,
    }

    private val loggers = mutableListOf<Logger>()

    /**
     * Adds a [Logger] to the list of delegated [Logger]s.
     */
    public fun addLogger(logger: Logger) {
        loggers.add(logger)
    }

    /**
     * Removes all known [Logger]s.
     */
    public fun clearLoggers() {
        loggers.clear()
    }

    /**
     * Log at a [Level.VERBOSE] level.
     */
    public fun verbose(message: String, throwable: Throwable? = null, tag: String = ""): Unit =
        logAtLevel(Level.VERBOSE, tag, throwable, message)

    /**
     * Log at a [Level.DEBUG] level.
     */
    public fun debug(message: String, throwable: Throwable? = null, tag: String = ""): Unit =
        logAtLevel(Level.DEBUG, tag, throwable, message)

    /**
     * Log at a [Level.INFO] level.
     */
    public fun info(message: String, throwable: Throwable? = null, tag: String = ""): Unit =
        logAtLevel(Level.INFO, tag, throwable, message)

    /**
     * Log at a [Level.WARNING] level.
     */
    public fun warn(message: String, throwable: Throwable? = null, tag: String = ""): Unit =
        logAtLevel(Level.WARNING, tag, throwable, message)

    /**
     * Log at a [Level.ERROR] level.
     */
    public fun error(message: String, throwable: Throwable? = null, tag: String = ""): Unit =
        logAtLevel(Level.ERROR, tag, throwable, message)

    /**
     * Log at a [Level.ASSERT] level.
     */
    public fun assert(message: String, throwable: Throwable? = null, tag: String = ""): Unit =
        logAtLevel(Level.ASSERT, tag, throwable, message)

    /**
     * Log at a given [Level].
     */
    private fun logAtLevel(level: Level, tag: String = "", throwable: Throwable? = null, message: String? = null) =
        loggers.forEach { it.log(level, tag, message, throwable) }
}
