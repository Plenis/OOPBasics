package DesignPatterns;

interface StratigicCalculation{

    int calculate(int a, int b);
}

class Addition implements StratigicCalculation{

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Subtraction implements StratigicCalculation{

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}

class Multiplication implements StratigicCalculation{

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}

class PowerOf implements StratigicCalculation{

    @Override
    public int calculate(int a, int b) {
        return (int)Math.pow(a, b);
    }
}

public class StrategyPattern {
    public static void main(String[] args) {

        StratigicCalculation addition = new Addition();
        StratigicCalculation subtraction = new Subtraction();
        StratigicCalculation multiplication = new Multiplication();
        StratigicCalculation power = new PowerOf();

        System.out.println(addition.calculate(5, 4));
        System.out.println(subtraction.calculate(5, 4));
        System.out.println(multiplication.calculate(5, 4));
        System.out.println(power.calculate(5, 4));

    }
}
