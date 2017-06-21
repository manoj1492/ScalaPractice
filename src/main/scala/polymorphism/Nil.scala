package polymorphism

class Nil[T] extends ListType[T]{
  def isEmpty: Boolean = true
  def head: T = throw new NoSuchElementException("Nil.head")
  def tail: ListType[T] = throw new NoSuchElementException("Nil.tail")
}  

