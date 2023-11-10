package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductMaster productMaster = loadProducts();

        productMaster.printSummary();

    }

    static ProductMaster loadProducts() {
        ProductMaster productMaster = new ProductMaster();

        productMaster.add(new Beverage("Coca-Cola Zero", 20.0, 1.5));
        productMaster.add(new Beverage("Coca-Cola", 18.0, 1.5));
        productMaster.add(new Toiletry("Shampoo Sedal", 19.0, "500ml"));
        productMaster.add(new Produce("Frutillas", 64.0, "kilo"));

        return productMaster;
    }
}