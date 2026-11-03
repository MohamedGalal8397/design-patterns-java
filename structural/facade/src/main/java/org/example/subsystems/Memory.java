package org.example.subsystems;

public class Memory{



    public String read(long lba, int size) {
        String data = "Some data";
        System.out.println("Reading data from Memory...");
        return data;
    }
}
