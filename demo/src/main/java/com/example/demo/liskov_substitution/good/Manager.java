package com.example.demo.liskov_substitution.good;

// TÜRETİLEN SINIF SADECE İHTİYACI OLAN ARAYÜZE ERİŞİM SAĞLAMIŞ OLDU.
public class Manager implements IEat,ISleep,IWork{
    @Override
    public void eat() {
        System.out.println("Manager::Eat");
    }

    @Override
    public void sleep() {
        System.out.println("Manager::Sleep");
    }

    @Override
    public void work() {
        System.out.println("Manager::Work");
    }
}
