import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstDemo {

    public static void main(String[] args) {

        // Create Product List
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 750));
        products.add(new Product(2, "Phone", 500));
        products.add(new Product(3, "Mouse", 25));
        products.add(new Product(4, "Keyboard", 80));

        // Find the first product
        Optional<Product> result = products.stream()
            .findFirst();

        // Check if a product was found
        if (result.isPresent()) {

            Product product = result.get();

            System.out.println(
                "First product: " + product.getName()
            );
        }
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}