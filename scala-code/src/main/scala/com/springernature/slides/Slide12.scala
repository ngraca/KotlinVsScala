package com.springernature.slides

object Slide12 {
  abstract class Ship(var health: Int = 100)

  trait Gun {
    val strength: Int = 1

    def fireAt(ship: Ship) = {
      ship.health -= (1 * strength)
    }
  }

  trait LaserGun extends Gun {
    override val strength: Int = 5
  }

  class Commander extends Ship() with Gun

  def main(args: Array[String]): Unit = {
    val commander = new Commander()
    val laserGunShip = new Ship() with LaserGun
    commander.fireAt(laserGunShip)
    println(commander.strength)
    println(commander.isInstanceOf[Gun])
  }
}
