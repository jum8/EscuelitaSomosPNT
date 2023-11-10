package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductMaster {
    private List<Product> products;

    public ProductMaster() {
        this.products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void printSummary() {
        for(Product product : this.products) {
            System.out.println(product);
        }
        System.out.println("=".repeat(29));
        Collections.sort(this.products);
        System.out.printf("Producto más caro: %s\n", this.products.getLast().getName());
        System.out.printf("Producto más barato: %s\n", this.products.getFirst().getName());
    }

}
