package PatternMatching

/**
  * Created by manojma on 5/11/2017.
  */
object MatchTest extends App {
  def matchTest(x: Any): Any = x match {
    case "two" => 2
    case y: Int => "scala.Int"
    case 1 => "one"
  }
  println(matchTest(1))
}
