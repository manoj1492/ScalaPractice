package polymorphism

object DemoList extends App{
  
def singleton[T](elem: T): ListType[T] = new Cons(elem, new Nil[T])

def nth[T](n: Int, xs: ListType[T]): T =
  if(xs.isEmpty) throw new IndexOutOfBoundsException
  else if(n==0) xs.head
  else nth(n-1, xs.tail)
  
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

  nth(-1, list)

}