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


// Example property-based tests
import org.scalatestplus.scalacheck.*

class MyPropertyTests extends AnyFlatSpec with Matchers with ScalaCheckPropertyChecks:

  "An Int" should "combine commutatively" in {
    forAll { (a: Int, b: Int) =>
      (a |+| b) should be (b |+| a)
    }
  }

  it should "invert" in {
    forAll { (a: Int) =>
      (a |+| a.inverse()) shouldBe Monoid[Int].empty
    }
  }


// eof


