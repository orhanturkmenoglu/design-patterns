package com.example.factorydesignpattern;

public class OperatingSystemFactory {

    // constructor gizli olmalı çünkü doğrudan fabrikayı yaratmamalıyız.
    private OperatingSystemFactory() {

    }

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type) {
            case "WINDOWS":
                return new WindowsOperatingSystem(version, architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("OS Not supported: " + type);
        }
    }


}
