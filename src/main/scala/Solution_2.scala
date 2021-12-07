object Solution_2 extends App{
  def f(list:List[Int]):List[Int] = {

    (list.indices.collect
    {
      case i if i % 2 == 0 => list(i) }
      ).toList
  }
  val result = f(list=List(2, 5, 3, 4, 6, 7, 8, 9))
  for (i<-result){
    println(i)
  }

}
