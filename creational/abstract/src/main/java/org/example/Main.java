package org.example;


import org.example.factory.GUIFactory;
import org.example.factory.concrete.MacFactory;
import org.example.factory.concrete.WindowsFactory;
import org.example.product.Button;
import org.example.product.Checkbox;

public class Main {
    public static void main(String[] args) {


        GUIFactory factory = new WindowsFactory(); // could be MacFactory / WindowsFactory
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.render();
    }
}