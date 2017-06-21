package polymorphism

class Cons[T](val head: T, val tail: ListType[T]) extends ListType[T] {
  def isEmpty : Boolean = false
}
