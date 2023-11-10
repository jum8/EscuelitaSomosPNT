package org.example;

public class Toiletry extends Product {
    private String content;

    public Toiletry(String name, Double price, String content) {
        super(name, price);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Contenido: %s ///  Precio: $%.0f",
                this.getName(), this.getContent(), this.getPrice());
    }
}
