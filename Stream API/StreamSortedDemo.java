import java.util.ArrayList;
import java.util.List;

public class StreamSortedDemo {

    public static void main(String[] args) {

        // Create Product List
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 750));
        products.add(new Product(2, "Phone", 500));
        products.add(new Product(3, "Mouse", 25));
        products.add(new Product(4, "Keyboard", 80));

        // Stream API
        products.stream()

            // Sort products by price
            // Small price → Large price
            .sorted((product1, product2) ->
                Double.compare(
                    product1.getPrice(),
                    product2.getPrice()
                )
            )

            // Print each product
            .forEach(product -> {
                System.out.println(
                    product.getName()
                    + " - $"
                    + product.getPrice()
                );
            });
    }
}


// Product class
class Product {

    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
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