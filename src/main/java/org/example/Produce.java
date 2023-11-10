package org.example;

public class Produce extends Product {
    private String unitOfSales;

    public Produce(String name, Double price, String unitOfSales) {
        super(name, price);
        this.unitOfSales = unitOfSales;
    }

    public String getUnitOfSales() {
        return unitOfSales;
    }

    public void setUnitOfSales(String unitOfSales) {
        this.unitOfSales = unitOfSales;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s ///  Precio: $%.0f /// Unidad de venta: %s",
                this.getName(), this.getPrice(), this.getUnitOfSales());
    }
}
