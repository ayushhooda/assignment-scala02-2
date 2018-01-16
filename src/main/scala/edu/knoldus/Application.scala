package edu.knoldus

import org.apache.log4j.Logger

object Application extends App {

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

  val obj = new PersonType
  val gamer = Gamer()
  val gamerString = obj.checkType(gamer)
  log.info(s"$gamerString \n")

  val trainer = Trainer()
  val trainerString = obj.checkType(trainer)
  log.info(s"$trainerString \n")

}
