package com.example.abstractfactorypattern.mac;

import com.example.abstractfactorypattern.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac button ");
    }
}
