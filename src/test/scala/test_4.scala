import org.scalatest.funsuite.AnyFunSuite

class test_4 extends AnyFunSuite{
  test("test4"){
    assert(Solution_4.ab_value(List(2, -4, 3, -1, 23, -4, -54)) === List(2,4,3,1,23,4,54))
  }

}
