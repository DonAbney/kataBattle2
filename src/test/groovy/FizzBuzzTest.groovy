package kataBattle.fizzbuzz

import org.junit.Test

class FizzBuzzTest {

    @Test
    void shouldReturnTheNumberItIsHanded() {
        assert(kataBattle.fizzbuzz.FizzBuzz.process(1) == 1)
    }

    @Test
    void shouldReturnFizIfTheNumberIsAMultipleOf3() {
        assert (kataBattle.fizzbuzz.FizzBuzz.process(3) == "Fizz")
        assert (kataBattle.fizzbuzz.FizzBuzz.process(6) == "Fizz")
    }

    @Test
    void shouldReturnBuzzIfTheNumberIsAMultipleOf5() {
        assert (kataBattle.fizzbuzz.FizzBuzz.process(5) == "Buzz")
        assert (kataBattle.fizzbuzz.FizzBuzz.process(10) == "Buzz")
    }
}
