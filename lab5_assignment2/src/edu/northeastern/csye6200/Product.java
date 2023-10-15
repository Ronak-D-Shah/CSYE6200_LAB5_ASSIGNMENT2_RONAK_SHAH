package edu.northeastern.csye6200;

public class Product {

	private String itemName;
    private double price;

    public Product(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{ itemName=\"" + itemName + "\", price=$" + price + " }";
    }
}