package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class FizzBuzzTest {

    @Test
    public void throws_exception_for_number_lower_then_one() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new FizzBuzz().play(0));
    }

    @Test
    public void returns_fizz_for_number_divisible_by_3() {
        assertThat(new FizzBuzz().play(6)).isEqualTo("Fizz");
    }

    @Test
    public void returns_buzz_for_number_divisible_by_5() {
        assertThat(new FizzBuzz().play(10)).isEqualTo("Buzz");
    }

    @Test
    public void returns_bar_for_number_divisible_by_7() {
        assertThat(new FizzBuzz().play(14)).isEqualTo("Bar");
    }

    @Test
    public void returns_number_when_not_divisible_by_3_5_and_7() {
        assertThat(new FizzBuzz().play(8)).isEqualTo("8");
    }

    @Test
    public void returns_fizz_when_contains_3() {
        assertThat(new FizzBuzz().play(31)).isEqualTo("Fizz");
    }

    @Test
    public void returns_buzz_when_contains_5() {
        assertThat(new FizzBuzz().play(52)).isEqualTo("Buzz");
    }

    @Test
    public void returns_bar_when_contains_7() {
        assertThat(new FizzBuzz().play(71)).isEqualTo("Bar");
    }

    @Test
    public void returns_fizzBuzz_for_number_divisible_by_3_and_5() {
        assertThat(new FizzBuzz().play(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void returns_fizzBar_for_number_divisible_by_3_and_7() {
        assertThat(new FizzBuzz().play(21)).isEqualTo("FizzBar");
    }

    @Test
    public void returns_buzzBar_for_number_divisible_by_5_and_7() {
        assertThat(new FizzBuzz().play(70)).isEqualTo("BuzzBar");
    }

    @Test
    public void returns_fizzBuzzBar_for_number_divisible_by_3_5_and_7() {
        assertThat(new FizzBuzz().play(105)).isEqualTo("FizzBuzzBar");
    }

    @Test
    public void returns_fizzBuzzBar_for_number_containing_3_5_and_7() {
        assertThat(new FizzBuzz().play(357)).isEqualTo("FizzBuzzBar");
    }
}