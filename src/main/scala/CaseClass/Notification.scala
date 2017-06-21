package CaseClass

/**
  * Created by manojma on 5/11/2017.
  */

//Immutable by default:- We cannot change the members of the case class directly
//Decomposable through pattern matching:-  pattern matching means identifying the type of case class by its name
// and takinga ctions accordingly
//Compared by structural equality instead of by reference: For every case class the Scala compiler generates
// an equals method which implements structural equality and a toString method
//Easy to instantiate and operate on

abstract class Notification





