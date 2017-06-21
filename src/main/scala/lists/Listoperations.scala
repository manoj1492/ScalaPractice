package lists

class Listoperations {
   
  def last(xs : List[Int]): Int = xs match{
    case List() => throw new Error("last of Empty list")
    case List(x) => x
    case y :: ys => last(ys) 
  }
  
  def init(xs : List[Int]): List[Int] = xs match{
    case List() => throw new Error("List is empty")
    case List(x) => List()
    case y::ys => y :: init(ys)
    
  }
  
  def concat(xs : List[Int], ys: List[Int]): List[Int] = xs match{
    case List() => ys
    case x :: xs => x :: concat(xs, ys)
  }
  
  def reverse(xs : List[Int]) : List[Int] = xs match{
    case List() => xs
    case y :: ys =>  concat(reverse(ys), List(y))
  }
}