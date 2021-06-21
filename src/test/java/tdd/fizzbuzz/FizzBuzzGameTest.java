package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class FizzBuzzGameTest {
    @Test
    public void prints_answers_up_to_number() {
        assertThat(new FizzBuzzGame().play(15)).isEqualTo("1,2,Fizz,4,Buzz,Fizz,Bar,8,Fizz,Buzz,11,Fizz,Fizz,Bar,FizzBuzz");
    }

    @Test
    public void throws_exception_for_number_higher_than_hundred() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() ->new FizzBuzzGame().play(101));
    }

    @Test
    public void throws_exception_for_number_lower_then_one() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() ->new FizzBuzzGame().play(-1));
    }
}
