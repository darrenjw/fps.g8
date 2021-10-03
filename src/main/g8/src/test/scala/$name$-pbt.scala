import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.*

import cats.*
import cats.implicits.*

// Example property-based tests

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


