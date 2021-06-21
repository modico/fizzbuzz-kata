package tdd.fizzbuzz;

public class FizzBuzz {

    public String play(int number) {
        if (number < 1) {
            throw new IllegalArgumentException();
        }
        StringBuilder answer = new StringBuilder();
        if(isDivisibleByThree(number) || isContainingThree(number)) {
            answer.append("Fizz");
        }
        if(isDivisibleByFive(number) || isContainingFive(number)) {
            answer.append("Buzz");
        }
        if(isDivisibleBySeven(number) || isContainingSeven(number)) {
            answer.append("Bar");
        }
        if (answer.isEmpty()) {
            return String.valueOf(number);
        } else {
            return answer.toString();
        }
    }

    private boolean isContainingSeven(int number) {
        return isContaining(number, "7");
    }

    private boolean isContainingFive(int number) {
        return isContaining(number, "5");
    }

    private boolean isContainingThree(int number) {
        return isContaining(number, "3");
    }

    private boolean isContaining(int number, String s) {
        return String.valueOf(number).contains(s);
    }

    private boolean isDivisibleBySeven(int number) {
        return isDivisibleBy(number,7);
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    private boolean isDivisibleByFive(int number) {
        return isDivisibleBy(number,5);
    }

    private boolean isDivisibleByThree(int number) {
        return isDivisibleBy(number, 3);
    }

}
