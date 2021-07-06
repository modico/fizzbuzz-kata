package tdd.fizzbuzz;

enum FizzBuzzBar {
    Fizz(3),
    Buzz(5),
    Bar(7);

    private final int number;

    FizzBuzzBar(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}