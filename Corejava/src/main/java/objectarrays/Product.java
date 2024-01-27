package objectarrays;
import java.util.*;

public class Product implements Comparable<Product> {
    private double price;
    private int id;

    public Product(double price, int id) {
        this.price = price;
        this.id = id;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }

    public static void main(String[] args) {
        ArrayList<Product> arr = new ArrayList<Product>();
        arr.add(new Product(30.0, 1));
        arr.add(new Product(150.0, 3));
        arr.add(new Product(200.0, 5));
        arr.add(new Product(300.0, 7));

        Collections.sort(arr);

        for (Product product : arr) {
            System.out.println("Product ID: " + product.id + ", Price: $" + product.price);
        }
    }
}


