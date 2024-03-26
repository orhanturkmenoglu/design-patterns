package com.example.abstractfactorypattern;

import com.example.abstractfactorypattern.uifactory.MacUIFactory;
import com.example.abstractfactorypattern.uifactory.WinUIFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryPatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AbstractFactoryPatternApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Application winApplication = new Application(new WinUIFactory());
        winApplication.paint();

        Application macApplication = new Application(new MacUIFactory());
        macApplication.paint();
    }
}
