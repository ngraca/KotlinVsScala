package com.springernature.slides

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


object Slide17 {
  case class Product(id: Long)

  def findProductByName(name: String): Future[Product] = ???
  def getRating(id: Long): Future[Int] = ???
  def getPrice(id: Long): Future[Int] = ???

  def main(args: Array[String]): Unit = {
    findProductByName("Some Product")
      .flatMap { product =>
        val ratingFut = getRating(product.id)
        val priceFut = getPrice(product.id)
        ratingFut.flatMap(rating => priceFut
          .map(price => (product, rating, price)))
      }
      .foreach { case (product, rating, price) =>
        println(s"$product has rating: $rating and price: $price")
      }
  }
}
