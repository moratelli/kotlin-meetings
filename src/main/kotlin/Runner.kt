package dev.moratelli

fun main() {
    val meeting = Meeting()

    println("Created: $meeting")
    val participant = Participant()
    val name = Name()
    name.name = "Pedro"
    participant.name = name
    participant.email = "PedroMoratelli@gmail.com"

    meeting.addParticipant(participant)
    //  meeting.meetingName = "Review"
    //  meeting.verifyParticipant("Pedro")
    //  meeting.verifyMeeting()

    //  meeting.logger
}