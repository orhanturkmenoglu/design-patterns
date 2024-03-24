package com.example.demo.open_closed_responsibility;

public class BadCalculator {

    // DİYELİM Kİ DAHA SONRADAN ÇARPMA VEYA BÖLME GİBİ İŞLEMLERİ DE DAHİL ETMEK İSTİYORUZ
    // BU YÜZDEN SINIFLARIMIZI VEYA YARATILAN NESNELERİ DEĞİŞTİRMEMİZE İZİN VERMEMELİYİZ.
    // BU ŞEKİLDE OLAN KÖTÜ KODLARDAN KAÇINMAMIZ GEREKİR ÇÜNKÜ YAZILIM DÜNYASI SÜREKLİ GELİŞMELER AÇIK
    public int calculateNumber(int number1, int number2, String type) {
        int result = 0;

        switch (type) {
            case "sum":
                result = number1 + number2;
                break;
            case "sub":
                result = number1 - number2;
        }

        return result;
    }
}
