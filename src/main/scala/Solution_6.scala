object Solution_6 extends App{
  def max_product(Arr:Array[Int]):Int={
    var max_value = Arr.max
    val n = Arr.length
    for(i <- 0 to n-1){
      for(j<-i+1 to n-1){
        if(Arr(i)*Arr(j) > max_value) max_value = Arr(i)* Arr(j)
      }
    }
max_value
  }
println(max_product(Array(2, 3, 5, 7, -7, 5, 8, -5)))
}
