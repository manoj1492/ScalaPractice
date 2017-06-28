package higherorderlistfunctions

object Listfunctions {
  def scaleList(xs : List[Int], factor: Int): List[Int] = xs match{
    case Nil => Nil
    case y:: ys => y * factor :: scaleList(ys, factor)
  }
  
  def scaleListWithMap(xs : List[Int], factor: Int): List[Int] = xs map(x => x * factor)
}