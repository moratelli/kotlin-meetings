package dev.moratelli

class Meeting(val meetingName: String, val location: Location = Location("")) {

    private val logger = Logger()

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

class Location(val address: String) {

}