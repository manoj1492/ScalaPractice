package CaseClass

/**
  * Created by manojma on 5/19/2017.
  */
object StringReverse {

  def main(args: Array[String]): Unit ={
    def reverse(str: String): String = {
      (for(n <- str.length -1 to 0 by -1)
        yield str(n)).mkString
    }

    val c = reverse("Manoj")
    print(c)
  }
}
