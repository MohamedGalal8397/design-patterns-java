package org.example.proxy;

import org.example.Image;
import org.example.RealImage;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {

            // Create the real image only on demand
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
