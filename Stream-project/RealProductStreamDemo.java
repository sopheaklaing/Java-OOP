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

public class RealProductStreamDemo {

    public static void main(String[] args) {

        // Create Product List
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 750));
        products.add(new Product(2, "Phone", 500));
        products.add(new Product(3, "Mouse", 25));
        products.add(new Product(4, "Keyboard", 80));
        products.add(new Product(5, "Monitor", 300));
        // 1. Filter products price > $100
        List<Product> expensiveProducts = products.stream()
            .filter(product -> product.getPrice() > 100)
            .toList();

        System.out.println("Expensive Products:");

        for (Product product : expensiveProducts) {
            System.out.println(
                product.getName()
                + " - $"
                + product.getPrice()
            );
        }
        // 2. Get only Product names
        List<String> productNames = products.stream()
            .map(product -> product.getName())
            .toList();

        System.out.println("\nProduct Names:");
        System.out.println(productNames);
        // 3. Filter + Map + Sort
        List<String> sortedNames = products.stream()
            .filter(product -> product.getPrice() > 100)
            .map(product -> product.getName())
            .sorted()
            .toList();

        System.out.println("\nSorted Expensive Product Names:");
        System.out.println(sortedNames);
        // 4. Check if ANY product price > $700
        boolean hasVeryExpensiveProduct = products.stream()
            .anyMatch(product -> product.getPrice() > 700);

        System.out.println(
            "\nHas product > $700: "
            + hasVeryExpensiveProduct
        );
        // 5. Check if ALL products price > $20
        boolean allProductsAbove20 = products.stream()
            .allMatch(product -> product.getPrice() > 20);

        System.out.println(
            "All products > $20: "
            + allProductsAbove20
        );
    }
}