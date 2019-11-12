import org.scalatest.FlatSpec

class CatsSpec extends FlatSpec {

  import cats._
  import cats.implicits._

 "A List" should "combine" in {
   val l = List(1,2) |+| List(3,4)
    assert(l === List(1,2,3,4))
  }

}

