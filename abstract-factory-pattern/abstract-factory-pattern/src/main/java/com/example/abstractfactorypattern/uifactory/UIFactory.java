package com.example.abstractfactorypattern.uifactory;

import com.example.abstractfactorypattern.Button;
import com.example.abstractfactorypattern.CheckBox;

import java.awt.*;

public interface UIFactory {

    Button createButton();

    CheckBox createCheckBox();

}
