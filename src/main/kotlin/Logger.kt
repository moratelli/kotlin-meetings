package dev.moratelli

interface Logger {
    fun debug(msg: String)
    fun warn(msg: String)
    fun info(msg: String) {
        warn(msg)
    }
}