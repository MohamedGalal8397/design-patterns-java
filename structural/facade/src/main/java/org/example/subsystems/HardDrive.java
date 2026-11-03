package org.example.subsystems;

public class HardDrive {

    public void load(long position, String data) {

        System.out.println("Loading " + data + " at position " + position);
    }

}
