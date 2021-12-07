import org.scalatest.funsuite.AnyFunSuite

class Test_1 extends AnyFunSuite{
  test("test1"){
    assert(Solution_1.repeat_value(4,List(1,2,3,4)) === List(1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4))
  }

}
