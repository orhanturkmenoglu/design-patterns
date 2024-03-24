package com.example.demo.liskov_substitution.bad;

public class Manager implements Person {
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
