import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import cats.*
import cats.implicits.*

// Example unit tests
class MyUnitTests extends AnyFlatSpec with Matchers:

  "A List" should "combine" in {
    val l = List(1,2) |+| List(3,4)
    l should be (List(1,2,3,4))
  }



// eof


