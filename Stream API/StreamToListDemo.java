import java.util.ArrayList;
import java.util.List;

public class StreamToListDemo {

    public static void main(String[] args) {

        // Create Product List
        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 750));
        products.add(new Product("Phone", 500));
        products.add(new Product("Mouse", 25));
        products.add(new Product("Keyboard", 80));

        // Process products
        // Keep products with price > 100
        // Then get only their names
        // Finally convert Stream to List
        List<String> result = products.stream()
            .filter(product -> product.getPrice() > 100)
            .map(product -> product.getName())
            .toList();

        // Print result
        System.out.println(result);
    }
}


// Product class
class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}