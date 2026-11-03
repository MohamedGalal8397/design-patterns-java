package org.example.factory;

import org.example.product.Button;
import org.example.product.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
