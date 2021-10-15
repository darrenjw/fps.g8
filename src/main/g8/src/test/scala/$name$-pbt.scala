import munit.ScalaCheckSuite
import org.scalacheck.Prop.*

import cats.*
import cats.implicits.*

// Example property-based tests

class MyPropertyTests extends ScalaCheckSuite:

  property("An Int should combine commutatively") {
    forAll { (a: Int, b: Int) =>
      (a |+| b) == (b |+| a)
    }
  }

  property("An Int should invert") {
    forAll { (a: Int) =>
      (a |+| a.inverse()) == Monoid[Int].empty
    }
  }


// eof


