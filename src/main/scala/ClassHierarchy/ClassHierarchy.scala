package ClassHierarchy

/**
  * Created by manojma on 6/15/2017.
  */
object ClassHierarchy {

  def main(args: Array[String]): Unit ={

    val t1 = EmptySet.include(3)

    val t2 = t1 include(4)

    val t3 = EmptySet.include(5)

    println (t1.contains(4))

    println(t1 +"and"+ t2)

    println(t2.union(t3))
  }
}
