package edu.knoldus

abstract class Person

case class Gamer() extends Person

case class Trainer() extends Person

case class Blogger() extends Person

class PersonType {

  def isGamer(): String = {
    def innerGamer(count: Int): String = {
      val r = scala.util.Random
      val startRange = 1
      val endRange = 6
      val diceNumber = startRange + r.nextInt(endRange)
      diceNumber match {
        case startRange | endRange => if (count == 0) "Winner" else innerGamer(count - 1)
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

  def checkType(person: Person): String = {
    person match {
      case Gamer() => isGamer()
      case Trainer() => attendance()
      case Blogger() => "bye"
    }
  }

}
