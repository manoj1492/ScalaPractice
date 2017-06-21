package polymorphism

trait ListType[T] {
  def isEmpty: Boolean
  def head: T
  def tail: ListType[T]
}


