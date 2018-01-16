package edu.knoldus

class Payment {

  def checkPaymentType(paymentType: String, amount: Int): Double = {
    paymentType.toLowerCase() match {
      case "paytm" => amount*1.02
      case "freecharge" => amount*1.02
      case "netbanking" => amount + 5
      case "card" => amount + 1.5
      case "cash" => amount
    }
  }

}
