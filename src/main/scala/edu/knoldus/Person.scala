package edu.knoldus

abstract class Person

case class Gamer() extends Person

case class Trainer() extends Person

case class Blogger() extends Person

class PersonType {

  def isGamer(): String = {
    def innerGamer(count: Int): String = {
      val r = scala.util.Random
      val diceNumber = 1 + r.nextInt(6)
      diceNumber match {
        case 1 | 6 => if (count == 0) "Winner" else innerGamer(count - 1)
        case _ => "Loser"
      }
    }
    innerGamer(3)
  }

  def attendance(): String = {
    val r = scala.util.Random
    (1 + r.nextInt(50)).toString
  }

  def checkType(person: Person): String = {
    person match {
      case Gamer() => isGamer()
      case Trainer() => attendance()
      case Blogger() => "bye"
    }
  }

}
