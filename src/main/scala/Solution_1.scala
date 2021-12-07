object Solution_1 extends App{
  def repeat_value(num: Int, list: List[Int]) =
    list.flatMap(List.fill(num)(_))

  val a = repeat_value(num = 4, list = List(1,2,3,4))
  for(n<-a)
    println(n)

}
