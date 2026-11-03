package org.example.factory.concrete;

import org.example.factory.GUIFactory;
import org.example.product.Button;
import org.example.product.Checkbox;
import org.example.product.concrete.MacButton;
import org.example.product.concrete.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
