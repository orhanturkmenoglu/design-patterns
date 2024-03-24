package com.example.demo.open_closed_responsibility;

public class SubstractOperation implements Operation {
    @Override
    public int perform(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("ÇIKARMA İŞLEMİ SONUCU : " + result);
        return result;
    }
}
