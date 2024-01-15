package Day4;


public class Product {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Overloaded getPrice method that takes quantity as a parameter
    public double getPrice(int quantity) {
        // Calculate the total price based on the quantity
        return price * quantity;
    }
}