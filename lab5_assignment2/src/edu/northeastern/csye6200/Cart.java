package edu.northeastern.csye6200;

public class Cart {

	private StringBuilder products;
    private double cartTotal;

    public Cart() {
        products = new StringBuilder();
        cartTotal = 0.0;
    }

    public double getCartTotal() {
        return cartTotal;
    }

    public void addProduct(Product product) {
        if (products.length() > 0) {
            products.append(", ");
        }
        products.append(product.getItemName());
        cartTotal += product.getPrice();
    }

    public double calculateChange(double payment) {
        return payment - cartTotal;
    }

    @Override
    public String toString() {
        return "Cart{ " + products + " }";
    }

}
