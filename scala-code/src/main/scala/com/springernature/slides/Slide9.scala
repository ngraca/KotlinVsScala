package com.springernature.slides


object Slide9 {
  case class Booking(hotel: Option[Hotel] = None, price: Long = 0)

  case class Hotel(name: String, stars: Option[Int] = None)

  def main(args: Array[String]): Unit = {
    val bOpt = Some(Booking(Some(Hotel("Ritz Four Seasons", Some(5)))))

    var stars = "*" * bOpt.flatMap(_.hotel).flatMap(_.stars).getOrElse(0)

    stars = "*" * (for {
      booking <- bOpt
      hotel <- booking.hotel
      stars <- hotel.stars
    } yield stars).getOrElse(0)

    for {
      booking <- bOpt
      hotel <- booking.hotel
    } yield println(s"${hotel.name} $stars")
  }
}
