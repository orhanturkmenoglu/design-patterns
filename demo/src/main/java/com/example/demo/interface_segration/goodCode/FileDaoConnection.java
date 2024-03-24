package com.example.demo.interface_segration.goodCode;

// BİRDEN FAZLA ARAYÜZ OLUŞTURARAK SORUMLULUKLARI ÖZELLEŞTİRİP
// SINIFLARIN SADECE İHTİYACI OLAN ARAYÜZE ERİŞİMİNİ SAĞLAMIŞ OLUYORUZ.
// BU SAYEDE GEREKSİZ KODUN DA ÖNÜNE GEÇMİŞ OLURUZ.
public class FileDaoConnection implements FileInterface,DaoInterface{
    @Override
    public void createRecord() {
        System.out.println("FileDaoConnection::createRecord");
    }

    @Override
    public void deleteRecord() {
        System.out.println("FileDaoConnection::deleteRecord");
    }

    @Override
    public void openFile() {
        System.out.println("FileDaoConnection::openFile");
    }
}
