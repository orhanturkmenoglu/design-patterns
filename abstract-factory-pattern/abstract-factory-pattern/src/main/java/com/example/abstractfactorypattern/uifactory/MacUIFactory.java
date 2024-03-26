package com.example.abstractfactorypattern.uifactory;

import com.example.abstractfactorypattern.Button;
import com.example.abstractfactorypattern.CheckBox;
import com.example.abstractfactorypattern.mac.MacButton;
import com.example.abstractfactorypattern.mac.MacCheckBox;
import com.example.abstractfactorypattern.win.WinButton;
import com.example.abstractfactorypattern.win.winCheckBox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
