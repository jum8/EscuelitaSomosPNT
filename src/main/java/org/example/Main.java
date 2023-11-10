package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    List<Product> loadProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Beverage("Coca-Cola Zero", 20.0, 1.5));
        products.add(new Beverage("Coca-Cola", 18.0, 2.0));
        products.add(new Toiletry("Shampoo Sedal", 20.0, "500ml"));
        products.add(new Produce("Frutillas", 64.0, "kilo"));

        return  products;
    }
}