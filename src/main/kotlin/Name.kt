package dev.moratelli

import java.lang.IllegalArgumentException

class Name(val name:String) {
    init {
        if(name.isBlank()) throw IllegalArgumentException()
    }
}