package com.example.demo.liskov_substitution.bad;

/// türetilen sınıf base sınıfın yerine geçmelidir.İhtiyacı olmayan davranışları sergilememelidir.
public class Robot implements Person{
    @Override
    public void eat() {
        System.out.println("Robot::YEMEK YİYEMEZ !!");
    }

    @Override
    public void sleep() {
        System.out.println("Robot::UYUMAZ !!");
    }

    @Override
    public void work() {
        System.out.println("Robot::SADECE ÇALIŞIR");
    }
}
