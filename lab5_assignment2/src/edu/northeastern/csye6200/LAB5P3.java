package edu.northeastern.csye6200;

public class LAB5P3 {

    public static void main(String[] args) {
        Product milk = new Product("Milk", 3.7);
        Product bread = new Product("Bread", 2.25);
        Product eggs = new Product("Eggs", 4.3);

        Cart cart = new Cart();
        cart.addProduct(milk);
        cart.addProduct(eggs);

        System.out.println("Creating the below products");
        System.out.println(milk);
        System.out.println(bread);
        System.out.println(eggs);

        System.out.println("\nAdding Milk and Eggs to Cart");
        System.out.println(cart);
        System.out.println("Total Cart Value: $" + cart.getCartTotal());

        double payment = 10.0;
        double change = cart.calculateChange(payment);
        System.out.println("\nCustomer payment: $" + payment);
        System.out.println("Total Change: $" + change);
    }
}