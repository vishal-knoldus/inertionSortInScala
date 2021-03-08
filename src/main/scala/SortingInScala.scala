object SortingInScala{

  def insertionSort(list: List[Int]): List[Int] = {
// insertSorted method will prepend element in sorted order
    def insertSorted(element: Int, sortedList: List[Int]): List[Int] = {
      if (sortedList.isEmpty || element <= sortedList.head)
        element :: sortedList
      else
        sortedList.head :: insertSorted(element, sortedList.tail)
    }

    if (list.isEmpty || list.tail.isEmpty)
      list
    else
      insertSorted(list.head, insertionSort(list.tail))

    /*
    insertSorted(11,insertionSort(15,2,5,4,6,7)) => insertSorted(11,{2,4,5,6,7,15})=>2 :: insertSorted(11,{4,5,6,7,15})=>2::4::insertSorted(11,{5,6,7,15})=>2::4::5::insertSorted(11,{6,7,15})=>2::4::5::6::insertSorted(11,{7,15}) =>2::4::5::6::7 ::insertSorted(11,{15}) => list(2,5,4,6,7,11,15)

    insertSorted(15,insertionSort(2,5,4,6,7))=>insertSorted(15,{2,4,5,6,7})=>2 :: insertSorted(15,{4,5,6,7})=>2::4::insertSorted(15,{5,6,7})=>2::4::5::insertSorted(15,{6,7})=>2::4::5::6::insertSorted(15,{7}) =>2::4::5::6::7 ::insertSorted(15,{}) => list(2,5,4,6,7,15)

    insertSorted(2,insertionSort(5,4,6,7))=>insertSorted(2,{4,5,6,7})=>list(2,4,5,6,7)

    insertSorted(5,insertionSort(4,6,7)) => insertSorted(5,{4,6,7}) => 4 :: insertSorted(5,{6,7}) => 4::list(5,6,7) => list(4,5,6,7)

    insertSorted(4,insertionSort(6,7)) => insertSorted(4,{6,7}) =>list(4,6,7)

    insertSorted(6,insertionSort(7))=>insertSorted(6,list(7)) => list(6,7)

    insertSorted(7,{emptyList})

     */

  }
  def main(args: Array[String]): Unit = {
    val myList = List(11,15,2,5,4,6,7)
    println(insertionSort(myList))
  }
}