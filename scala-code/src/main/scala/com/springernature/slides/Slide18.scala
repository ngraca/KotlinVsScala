package com.springernature.slides

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


object Slide18 {
  case class Product(id: Long)

  def findProductByName(name: String): Future[Product] = ???
  def getRating(id: Long): Future[Int] = ???
  def getPrice(id: Long): Future[Int] = ???

  def main(args: Array[String]): Unit = {
    for {
      product <- findProductByName("Some Product")
      rating <- getRating(product.id)
      price <- getPrice(product.id)
    } yield println(s"$product has rating: $rating and price: $price")

    for {
      product <- findProductByName("Some Product")
      ratingFut = getRating(product.id)
      priceFut = getPrice(product.id)
      rating <- ratingFut
      price <- priceFut
    } yield println(s"$product has rating: $rating and price: $price")
  }
}
