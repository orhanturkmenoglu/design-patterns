package com.example.demo.dependency_inversion.good;

public class SubOperation implements CalculatorOperation {
    @Override
    public int calculate(int number1, int number2) {
        return number1-number2;
    }
}
