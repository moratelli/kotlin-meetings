package dev.moratelli

import java.lang.IllegalArgumentException

class Meeting {

    private val logger = Logger()
    val meetingName: String = ""


    fun addParticipant(participant: Participant) {
        if(verifyParticipants(participant))
        println("Added: ${participant.participantName}")
    }

    private fun verifyParticipants(participant: Participant) : Boolean {
        println("Try to verify")
        return true
    }

    protected fun verifyMeeting() {

    }
}

class Participant {
    var name: Name = Name()
    var email = ""

    val participantName
        get() = name.name

    val canonicalEmail
        get() = email.toUpperCase()
}

class Name {
    var name : String = ""
        set(value: String) {
            if(value.isNullOrBlank()) throw IllegalArgumentException()
            field = value;
        }
}