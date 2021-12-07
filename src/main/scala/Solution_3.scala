object Solution_3 extends App{
  def elements_list(list:List[Int]):Int = {

    val index_value = list.indexOf(list.last)+1 // this will give the last index value and when we add 1 it will give complete nuber of elements in the list
    index_value
  }
  println(elements_list(list = List(2, 5, 1, 4, 3, 7, 8, 6, 0,9)))


}
