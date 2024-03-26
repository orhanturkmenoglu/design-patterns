package com.example.abstractfactorypattern.win;

import com.example.abstractfactorypattern.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win button ");
    }
}
