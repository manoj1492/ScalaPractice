package Decomposition

object ExprRun {
  def main(args: Array[String]){
    
    val sum = Sum(Number(1), Number(2))
    val prod =  Prod(Number(3), sum)
   println (sum eval)
   println (sum show)
   println(prod show)
  }
}