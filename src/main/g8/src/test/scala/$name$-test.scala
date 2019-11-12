import org.scalatest.flatspec.AnyFlatSpec

class CatsSpec extends AnyFlatSpec {

  import cats._
  import cats.implicits._

 "A List" should "combine" in {
   val l = List(1,2) |+| List(3,4)
    assert(l == List(1,2,3,4))
  }

}

