import cats.implicits.*

@main def helloWorld(): Unit =
  val message = "Hello, Cats!".pure[Option].getOrElse("Default message")
  println(message)