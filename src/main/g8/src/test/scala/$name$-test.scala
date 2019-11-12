import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec

class CatsSpec extends AnyFlatSpec with Matchers {

  import cats._
  import cats.implicits._

 "A List" should "combine" in {
   val l = List(1,2) |+| List(3,4)
   l should be (List(1,2,3,4))
  }

}

