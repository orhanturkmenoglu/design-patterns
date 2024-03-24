package com.example.demo.dependency_inversion.good;

// YÜKSEK SEVİYELİ SINIFLAR KENDİNDEN DÜŞÜK SEVİDEYEKİ SINIFLARA BAĞIMLI OLMAMALIDIR.BAĞIMLILIĞI TERSİNE ÇEVİRMİŞ OLDUK
public class Calculator {
    public int calculateNumber(int number1, int number2, CalculatorOperation calculatorOperation) {
        return calculatorOperation.calculate(number1, number2);
    }
}
