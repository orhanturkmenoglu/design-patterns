package com.example.demo.single_responsibility;

import java.text.DateFormat;
import java.time.LocalDate;

public class UserOperations {

    private User user;

    public UserOperations(User user) {
        this.user = user;
    }

    public void createUser(User user){
        System.out.println("UserOperations::createUser started");
        System.out.println("KULLANICI KAYIT BAŞARILI : "+user.toString());
        System.out.println("UserOperations::createUser finished");
    }

    public void updateUser(User user){
        System.out.println("UserOperations::createUser started");
        System.out.println("KULLANICI KAYIT BAŞARILI : "+user.toString());
        System.out.println("UserOperations::createUser finished");
    }

    public void deleteUser(User user){
        System.out.println("UserOperations::createUser started");
        System.out.println("KULLANICI KAYIT BAŞARILI : "+user.toString());
        System.out.println("UserOperations::createUser finished");
    }

    public void getUsers(){
        System.out.println("UserOperations::getUsers started");
        System.out.println("KULLANICI LİSTESİ DÖNDERİLDİ : "+user.toString());
        System.out.println("UserOperations::createUser finished");
    }


    // BİR SINIFIN VEYA ARAYÜZÜN SADECE BİR SORUMLULUĞU OLMALIDIR BU SINIF SADECE KULLANICI CRUD İŞLEMLERİNDEN
    // SORUMLU BİR SINIFTIR BU AŞAĞIDA YAZILAN YAŞ HESAPLAMA METHODUNU TEK SORUMLULUK PRENSİPLERİNE AYKIRIDIR.
    // BU YÜZDEN YENİ BİR SINIF OLUŞTURARAK YAŞ HESAPLAMA İŞLEMİNİ AYIRMAMIZ GEREKİR.
    public int  calculateAge(int birthYear){
        int calculatedAge = LocalDate.now().getYear()-(birthYear);
        System.out.println("KULLANICI YAŞ HESAPLAMA BAŞARILI : "+calculatedAge);
        return calculatedAge;
    }

}
