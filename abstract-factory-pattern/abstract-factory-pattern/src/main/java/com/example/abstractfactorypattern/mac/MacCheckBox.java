package com.example.abstractfactorypattern.mac;

import com.example.abstractfactorypattern.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac checkbox ");
    }
}
