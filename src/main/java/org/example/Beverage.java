package org.example;

public class Beverage extends Product {
    private Double liters;

    public Beverage(String name, Double price, Double liters) {
        super(name, price);
        this.liters = liters;
    }

    public Double getLiters() {
        return liters;
    }

    public void setLiters(Double liters) {
        this.liters = liters;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Litros: %.2f ///  Precio: $%.0f",
                this.getName(), this.getLiters(), this.getPrice());
    }
}
