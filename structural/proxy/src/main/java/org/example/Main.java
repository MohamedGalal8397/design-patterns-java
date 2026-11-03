package org.example;


import org.example.proxy.ProxyImage;

public class Main {
    public static void main(String[] args) {


        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");


        System.out.println("_________________________________");

        // الصورة الحقيقية تتحمل بس لما نعرضها
        image1.display();
        // مش هيحمل تاني، هيتعرض مباشرة
        image1.display();

        System.out.println("_________________________________");

        image2.display();

        System.out.println("_________________________________");

    }
}