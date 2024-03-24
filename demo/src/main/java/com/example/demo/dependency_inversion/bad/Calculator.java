package com.example.demo.dependency_inversion.bad;

// YÜKSEK SEVİYELİ SINIFLAR KENDİNDEN DÜŞÜK SEVİDEYEKİ SINIFLARA BAĞIMLI OLMAMALIDIR.
// sayı hesapla methodu kendinden yüksek seviyedeki classa bağımlı hale gelmiştir bağımlılığı tersine çevirmemiz gerekir.
public class Calculator {
    public int calculateNumber(int number1, int number2, String operation) {
        int result = 0;
        switch (operation) {
            case "add":
                AddOperation addOperation = new AddOperation();
                result =addOperation.add(number1,number2);
                break;
            case "sub":
                SubOperation subOperation = new SubOperation();
                result = subOperation.sub(number1,number2);
        }

        return result;
    }
}
