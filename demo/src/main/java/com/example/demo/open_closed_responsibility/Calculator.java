package com.example.demo.open_closed_responsibility;

public class Calculator {
    public int calculatorNumber(int number1, int number2, Operation operation) {
        return operation.perform(number1, number2);
    }
}
