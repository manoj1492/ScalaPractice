package CaseClass

/**
  * Created by manojma on 5/11/2017.
  */
object Caseclasstest extends App {

  val emailFromJohn = Email("johndoe@gmail.com", "John", "Hi I am John")// no new keyword required to instantiate
  val title = emailFromJohn.title// members can be accessed directly as they are public by default
  println(title)

  val editedEmail = emailFromJohn.copy(title="Hi there", body = "Hello World")// cannot reassign value to title member
  // , so creating a copy of title

  println(emailFromJohn)
  println(editedEmail)
}
