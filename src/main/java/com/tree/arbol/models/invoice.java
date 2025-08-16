package com.tree.arbol.models;

public class invoice {
    
    private String nameProduct;
    private int quantity;
    private double price;
    private double total;
    private String date;

    public invoice(String nameProduct, int quantity, double price, double total, String date) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.date = date;
    }

    public invoice() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    

}
