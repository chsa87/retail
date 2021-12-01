package ru.my.retail.model;

public class Product {

    int price;
    int weight;
    String name;
    String decription;
    String packageType;

    void buy() {
        System.out.println("Run buy");
    }

    void readDecription() {
        System.out.println("Run readDecription");
    }

    void openPackage() {
        System.out.println("Run openPackage");
    }

    void take() {
        System.out.println("Run take");
    }


}
