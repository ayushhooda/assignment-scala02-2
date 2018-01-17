package edu.knoldus

import org.apache.log4j.Logger

object Application extends App {

  // scalastyle:off
  val ONE = 1
  val SIX = 6
  val FIFTY = 50
  val FIVE = 5
  // scalastyle:on

  val log = Logger.getLogger(this.getClass)
  val paymentObject = new Payment
  val amount: Int = 100
  val paymentType1: String = "paytm"
  val paymentType2: String = "freecharge"
  val paymentType3: String = "netbanking"
  val paymentType4: String = "card"
  val paymentType5: String = "cash"
  val amountPayTm = paymentObject.checkPaymentType(paymentType1, amount)
  val amountFreeCharge = paymentObject.checkPaymentType(paymentType2, amount)
  val amountNetBanking = paymentObject.checkPaymentType(paymentType3, amount)
  val amountCard = paymentObject.checkPaymentType(paymentType4, amount)
  val amountCash = paymentObject.checkPaymentType(paymentType5, amount)
  log.info(s"Amount while using Paytm: $amountPayTm \n")
  log.info(s"Amount while using Freecharge: $amountFreeCharge \n")
  log.info(s"Amount while using NetBanking: $amountNetBanking \n")
  log.info(s"Amount while using Card: $amountCard \n")
  log.info(s"Amount while using Cash: $amountCash \n")

  val personObject = new PersonType
  val gamer = Gamer()
  val gamerString = personObject.checkType(gamer)
  log.info(s"$gamerString \n")

  val trainer = Trainer()
  val trainerString = personObject.checkType(trainer)
  log.info(s"$trainerString \n")

  val initialMap = Map("Scala" -> 2, "Java" -> 5, "Kafka" -> 6)
  val blogger = Blogger(initialMap)
  val bloggerString = personObject.checkType(blogger)
  log.info(s"$bloggerString \n")

}
