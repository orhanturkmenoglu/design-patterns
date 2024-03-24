package com.example.demo.liskov_substitution.bad;

public class Employee implements Person{
    @Override
    public void eat() {
        System.out.println("Employee::Eat");
    }

    @Override
    public void sleep() {
        System.out.println("Employee::Sleep");
    }

    @Override
    public void work() {
        System.out.println("Employee::Work");
    }
}
