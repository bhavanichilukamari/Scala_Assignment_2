object Solution_5 extends App{
  def replaceMax(arr:Array[Int]):Array[Int] = {
    val n = arr.length
    val maxIndex = arr.indexOf(arr.max)
    arr(n-1) = -1
    var rMax = -1
    for(i <- 0 to n-1 ){
      rMax = -1
      for(j <- i+1 to n-1){
        if(arr(i)<arr(j) && rMax<arr(j) && i<j) {
          rMax = arr(j)
        }
        arr(i) = rMax
      }
    }
    arr(maxIndex) = -1
    arr
  }


  val resarr = replaceMax(Array(9, 5, 8, 4, -10, 21, 6, 17, 11))
  resarr.foreach(println)
}