package dev.moratelli

open class Location

class Room(val roomName: String) : Location()

class BrAddress(val firstLine: String,
                val secondLine: String,
                val city: String,
                val state: String,
                val postCode: String) : Location()