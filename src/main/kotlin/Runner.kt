package dev.moratelli

fun main() {
    val meeting = Meeting("Review", BrAddress("R. dos Gatos, 30", "Casa 2", "Florianópolis", "SC", "88000-000"))
    val review = PersonalReview("Review Meeting", Participant(Name("Alice"), ""), listOf(), Room("Room 1"))

    println("Created: $review with name ${review.meetingName} and at ${review.locationName}")
    val name = Name("Pedro Moratelli")

    review.closeReview()

    val participant = Participant(name, "PedroMoratelli@gmail.com")

    meeting.addParticipant(participant)
    //  meeting.meetingName = "Review"
    //  meeting.verifyParticipant("Pedro")
    //  meeting.verifyMeeting()

    //  meeting.logger
}