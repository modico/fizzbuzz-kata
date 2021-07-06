package tdd.fizzbuzz;

import java.util.Arrays;

public class FizzBuzz {

    public String play(int number) {
        if (number < 1) {
            throw new IllegalArgumentException();
        }
        StringBuilder answer = new StringBuilder();
        Arrays.stream(FizzBuzzBar.values()).forEach(value -> {
            if (isDivisibleOrContaining(number, value))
                answer.append(value.name());
        });
        return answer.isEmpty() ? String.valueOf(number) : answer.toString();
    }

    private boolean isDivisibleOrContaining(int number, FizzBuzzBar value) {
        return isDivisibleBy(number, value.getNumber()) || isContaining(number, String.valueOf(value.getNumber()));
    }

    private boolean isContaining(int number, String s) {
        return String.valueOf(number).contains(s);
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

}