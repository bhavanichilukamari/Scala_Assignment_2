object Solution_7 extends App{
  def max_Difference(array: Array[Int]) = {

    val result = array.max - array.min
    result

  }

  println(max_Difference(array = Array(2, 3, 1, 7, 9, 5, 11, 3, 5)))

}
