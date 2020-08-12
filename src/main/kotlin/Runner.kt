package dev.moratelli

import java.nio.file.Paths

fun main() {
    val postCode = USZipCode("12345")

    val logger: Logger = FileLogger(Paths.get("/some/file.log"))

    val meeting = Meeting("Review",
        UkAddress("R. dos Gatos, 30", "Casa 2", "Florianópolis", "SC", UKPostCode("")), logger
    )
    val review = PersonalReview("Review Meeting", Participant(Name("Alice"), ""), listOf(),
        Room("Room 1"), logger
    )

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