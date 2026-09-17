import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectDemo {

    public static void main(String[] args) {

        // Create Product List
        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 750));
        products.add(new Product("Phone", 500));
        products.add(new Product("Mouse", 25));

        // Stream
        // Filter products with price > 100
        // Get product names
        // Collect result into List
        List<String> result = products.stream()
            .filter(product -> product.getPrice() > 100)
            .map(product -> product.getName())
            .collect(Collectors.toList());

        System.out.println(result);
    }
}


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