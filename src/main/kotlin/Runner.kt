package dev.moratelli

fun main() {
    val meeting = Meeting("Review", Location("an address"))

    println("Created: $meeting with name ${meeting.meetingName} and at ${meeting.location}")
    val name = Name("Pedro Moratelli")

    val participant = Participant(name, "PedroMoratelli@gmail.com")

    meeting.addParticipant(participant)
    //  meeting.meetingName = "Review"
    //  meeting.verifyParticipant("Pedro")
    //  meeting.verifyMeeting()

    //  meeting.logger
}