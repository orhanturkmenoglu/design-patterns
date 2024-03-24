package com.example.demo.interface_segration.badCode;

// ARAYÜZ HEM VERİTABANI İLE BAĞLANTI SAĞLIYOR
// HEM KAYIT OLUŞTURUP KAYIT SİLME İŞLEMİ YAPIYOR
// BU ARAYÜZDE İKİ SORUMLULUK TEK ARAYÜZE YÜKLENİLMİŞ
// BUNUN YERİNE ARAYÜZÜMÜZÜ BİRDEN FAZLA OLUŞTURARAK İŞLEMLERİ
// BÖLMEMİZ DAHA DOĞRU OLUR
public interface BadDaoInterface {

    void openConnection();
    void createRecord();
    void openFile();
    void deleteRecord();
}
