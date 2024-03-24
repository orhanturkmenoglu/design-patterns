package com.example.demo.liskov_substitution.bad;

/// türetilen sınıf base sınıfın yerine geçmelidir.İhtiyacı olmayan davranışları sergilememelidir.

public interface Person {
    void eat();
    void sleep();
    void work();
}
