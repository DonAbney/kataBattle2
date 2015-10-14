package kataBattle.fizzbuzz

import org.junit.Test

class FizzBuzzTest {

    @Test
    void shouldReturnTheNumberItIsHanded() {
        assert(kataBattle.fizzbuzz.FizzBuzz.process(1) == 1)
    }
}
