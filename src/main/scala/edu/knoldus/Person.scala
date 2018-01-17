package edu.knoldus

abstract class Person

case class Gamer() extends Person

case class Trainer() extends Person

case class Blogger(blogList: Map[String, Int]) extends Person

class PersonType {

  def isGamer(): String = {
    def innerGamer(count: Int): String = {
      val r = scala.util.Random
      val startRange = 1
      val endRange = 6
      val diceNumber = startRange + r.nextInt(endRange)
      diceNumber match {
        case Application.ONE | Application.SIX => if (count == 0) "Winner" else innerGamer(count - 1)
        case _ => "Loser"
      }
    }

    innerGamer(3)
  }

  def attendance(): String = {
    val r = scala.util.Random
    val startRange = 1
    val endRange = 6
    (startRange + r.nextInt(endRange)).toString
  }

  def favouriteTechnology(map: Map[String, Int]): String = {
    def innerFunction(map: Map[String, Int], count: Int): String = {
      val random = scala.util.Random
      val allKeys = map.keySet
      val randomKey = allKeys.toVector(random.nextInt(allKeys.size))
      count match {
        case 0 => innerFunction(map.updated(randomKey, map(randomKey) + 1), count - 1)
        case _ => map.valuesIterator.max.toString
      }
    }
    innerFunction(map, Application.FIVE)
  }

  def checkType(person: Person): String = {
    person match {
      case Gamer() => isGamer()
      case Trainer() => attendance()
      case Blogger(map: Map[String, Int]) => favouriteTechnology(map)
    }
  }

}
