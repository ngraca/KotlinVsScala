package com.springernature.slides

open class Ship(
    var health: Int = 100
)

interface Gun {
    val strength: Int

    fun fireAt(ship: Ship) {
        ship.health =- (1 * strength)
    }
}

class LaserGun(
    override val strength: Int = 5
): Gun

class Commander(gun: Gun): Ship(), Gun by gun

fun main() {
    val commander = Commander(LaserGun())
    commander.fireAt(Commander(LaserGun()))
    commander.strength
    commander is Gun
}