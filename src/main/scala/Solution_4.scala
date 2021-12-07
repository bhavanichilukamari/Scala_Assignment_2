object Solution_4 extends App{
  def ab_value(list:List[Int]):List[Int]=
  {
    list.map(math.abs)
  }
  val results = ab_value(list = List(2, -4, 3, -1, 23, -4, -54))
  for (i<-results)
    println(i)
}


