package com.example.abstractfactorypattern.uifactory;

import com.example.abstractfactorypattern.Button;
import com.example.abstractfactorypattern.CheckBox;
import com.example.abstractfactorypattern.uifactory.UIFactory;
import com.example.abstractfactorypattern.win.WinButton;
import com.example.abstractfactorypattern.win.winCheckBox;

public class WinUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new winCheckBox();
    }
}
