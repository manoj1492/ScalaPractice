package lists

object ListRun {
  def main( args: Array[String] ) : Unit ={
    val sort = new Insertionsort
    val list = List(1,4,3,8,9)
    
    val list2 = List(10,40,30,80,90)
    val sortedList = sort isort(list)
    println(sortedList)
    
    
    val listOperations = new Listoperations
    println(listOperations last list )
    println(listOperations init sortedList )
    println(listOperations concat(list,list2))
    println(listOperations reverse list )
  }
}