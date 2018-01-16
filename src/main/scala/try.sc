//val str = 1 #:: 2 #:: 3 #:: Stream.empty
//
//val p = (1 to 5).par
//p.map{ x => print(x); x }
//
//// Option type
//val opt = Some(2)
//val noOpt = None
//val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
//val capital: Option[String] = capitals get "France"
//val nonExistentRecord = capitals get "India"
//
//capitals get "North Pole"
//
//capital match {
//  case Some(cap) => cap
//  case None => "doSomethingElse"
//}
//
//nonExistentRecord match {
//  case Some(cap) => cap
//  case None => "doSomethingElse"
//}
//
//// Using get on an option (None pe get marne pe fat jayega)
//// So use fold/ getOrElse instead
//
//// Using getOrElse, here issue is type safety, so avoid
//capital.getOrElse(1)
//noOpt.getOrElse("Got nothing")
//
//// Using fold, best practice
//val capValue = capital.fold("No capital found")(_.toUpperCase)
//capital.fold("No capital found")(identity)
//
//
//// Case class
//case class Person(fname: String, lname: String)
//
//val person = Person("Martin", "ordisky")
//person.fname
//
//val newPerson = person.copy(lname = "bye")
//newPerson.fname
//
//val createPerson = Person.apply _
//val person1 = createPerson("Max", "tax")
//
//// pattern matching in case class
