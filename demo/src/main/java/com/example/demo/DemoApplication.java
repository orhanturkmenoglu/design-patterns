package com.example.demo;

import com.example.demo.open_closed_responsibility.AddOperation;
import com.example.demo.open_closed_responsibility.Calculator;
import com.example.demo.open_closed_responsibility.Operation;
import com.example.demo.single_responsibility.User;
import com.example.demo.single_responsibility.UserCalculation;
import com.example.demo.single_responsibility.UserOperations;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("***************************************************************");
        User user = new User();
        user.setId(1L);
        user.setIdentity("12345687900");
        user.setFirstName("ORHAN");
        user.setLastName("TÜRKMENOĞLU");
        user.setBirthYear(1999);

        UserOperations userOperations = new UserOperations(user);
        userOperations.createUser(user);

        UserCalculation userCalculation = new UserCalculation();
        userCalculation.calculateAge(user);
        System.out.println("***************************************************************");

        Operation addOperation = new AddOperation();

        Calculator addCalculator = new Calculator();
        addCalculator.calculatorNumber(10, 20, addOperation);

    }
}
