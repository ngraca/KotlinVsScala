package com.springernature.slides

class Booking(val hotel: Hotel? = null,
    val price: Long = 0)

class Hotel(val name: String, val stars: Int? = null)

fun main() {
    val booking: Booking? = Booking(Hotel("Ritz Four Seasons", 5))

    val stars = "*".repeat(booking?.hotel?.stars?: 0)

    if(booking != null && booking.hotel != null) {
        println("${booking.hotel.name} $stars ")
    }
}
