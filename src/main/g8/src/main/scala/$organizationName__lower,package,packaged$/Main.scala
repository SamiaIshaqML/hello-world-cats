package $organizationName$.$projectName$

import cats.implicits.*

object Main extends App {
  val message = "Hello, Cats!".pure[Option].getOrElse("Default message")
  println(message)

}
