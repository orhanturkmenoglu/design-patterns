package com.example.factorydesignpattern;

public class LinuxOperatingSystem extends OperatingSystem {
    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("LinuxOperatingSystem::changeDir"+dir);
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("LinuxOperatingSystem::removeDir"+dir);
    }
}
