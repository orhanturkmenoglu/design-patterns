package com.example.factorydesignpattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryDesignPatternApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FactoryDesignPatternApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        OperatingSystem windowsFactory = OperatingSystemFactory.getInstance("WINDOWS", "64", "Windows");
        System.out.println("Version :"+windowsFactory.getVersion());
        System.out.println("Architecture :"+windowsFactory.getArchitecture());
        windowsFactory.changeDir("windowsFactory/Applications");
        windowsFactory.removeDir("windowsFactory/C");

        OperatingSystem linuxFactory = OperatingSystemFactory.getInstance("LINUX", "32", "Linux");
        System.out.println("Version :"+linuxFactory.getVersion());
        System.out.println("Architecture :"+linuxFactory.getArchitecture());
        linuxFactory.changeDir("linuxFactory/Applications");
        linuxFactory.removeDir("linuxFactory/C");
    }
}
