package org.example.factory.concrete;

import org.example.factory.GUIFactory;
import org.example.product.Button;
import org.example.product.Checkbox;
import org.example.product.concrete.WindowsButton;
import org.example.product.concrete.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
