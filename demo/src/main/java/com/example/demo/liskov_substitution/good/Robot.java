package com.example.demo.liskov_substitution.good;

// ROBOT CLASSI SADECE KENDİNE YARAYAN METHODA ERİŞİM SAĞLADI
// BU SAYEDE GEREKSİZ KODUN ÖNÜNE DE GEÇİLMİŞ OLDU.
public class Robot implements IWork{
    @Override
    public void work() {
        System.out.println("Robot::SADECE ÇALIŞIR");
    }
}
