package com.example.abstractfactorypattern.win;

import com.example.abstractfactorypattern.Button;
import com.example.abstractfactorypattern.CheckBox;

public class winCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win checkbox ");
    }
}
