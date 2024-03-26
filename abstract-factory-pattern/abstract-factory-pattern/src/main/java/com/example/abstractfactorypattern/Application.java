package com.example.abstractfactorypattern;

import com.example.abstractfactorypattern.uifactory.UIFactory;

public class Application {

    private Button button;
    private CheckBox checkbox;


    public Application(UIFactory uiFactory) {
        button = uiFactory.createButton();
        checkbox = uiFactory.createCheckBox();
    }


    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
