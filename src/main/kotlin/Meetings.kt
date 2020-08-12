package dev.moratelli

import java.nio.file.Paths

open class Meeting(val meetingName: String, open val location: Location, val logger: Logger) {

    open val locationName = ""

    fun addParticipant(participant: Participant) {
        logger.info("Participant added")
        if(verifyParticipants(participant))
            println("Added: ${participant.participantName}")
    }

    private fun verifyParticipants(participant: Participant) : Boolean {
        println("Try to verify")
        return true
    }

    protected open fun verifyMeeting() {
        println("Meeting: verify meeting")
    }
}

class PersonalReview(meetingName: String, val employee: Participant, reviewers: List<Participant>, override val location: Room, logger: Logger) : Meeting(meetingName, location, logger){

    override val locationName
        get() = location.roomName

    fun closeReview() {
        println("Review ended")
        verifyMeeting()
    }

    override fun verifyMeeting() {
        println("Personal Review: verify meeting")
        super.verifyMeeting()
    }
}