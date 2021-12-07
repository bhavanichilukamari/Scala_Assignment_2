import org.scalatest.funsuite.AnyFunSuite

class test_5 extends AnyFunSuite{
  test("test5"){
    assert(Solution_5.replaceMax(Array(9, 5, 8, 4, -10, 21, 6, 17, 11)) === Array(21, 21, 21, 21, 21, -1, 17, -1, -1))
  }

}
