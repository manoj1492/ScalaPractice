package MixingClass

/**
  * Created by manojma on 5/10/2017.
  */
// Returns successive characters of a given string
class StringIterator (s: String) extends AbsIterator{

  type T = Char // defining Type T
  private var i = 0
  def hasNext = i < s.length // overriding hasNext of AbsIterator : returns true or false on comparing value of 'i' with string length
  def next = { val ch = s.charAt(i) ; i+=1; ch} // overriding next: ch stores the character at ith position
                                              // then incrementing i
                                              // then returning ch, println of Richiterator is applied to this ch
  //To write multiple expression sin one line, seperate it with a semicolon

}
