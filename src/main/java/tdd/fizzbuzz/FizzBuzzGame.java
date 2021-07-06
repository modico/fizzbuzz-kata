package tdd.fizzbuzz;

public class FizzBuzzGame {

    public String play(int number) {
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException();
        }
        StringBuilder output = new StringBuilder();
        for(int input = 1; input <= number; input++) {
            output.append(new FizzBuzz().play(input));
            if(input != number) {
                output.append(",");
            }
        }
        return output.toString();
    }

}