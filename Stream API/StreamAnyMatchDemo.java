import java.util.ArrayList;
import java.util.List;

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

public class StreamAnyMatchDemo {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 750));
        products.add(new Product(2, "Phone", 500));
        products.add(new Product(3, "Mouse", 25));

        // Check:
        // Is there at least one product
        // with price greater than 700?

        boolean result = products.stream()
            .anyMatch(product -> product.getPrice() > 700);

        System.out.println("Has expensive product: " + result);
    }
}