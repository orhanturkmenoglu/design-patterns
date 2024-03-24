package com.example.demo.single_responsibility;

import java.time.LocalDate;

public class UserCalculation {
    public int  calculateAge(User user){
        int age=LocalDate.now().getYear() -(user.getBirthYear());
        System.out.println("KULLANICI YAŞI : "+age);
        return age ;
    }
}
