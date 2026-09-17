import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        // Supplier does not receive any input.
        // It returns a value.

        Supplier<String> getMessage = () -> {
            return "Hello Sopheak";
        };

        // Call the Supplier
        String message = getMessage.get();

        System.out.println(message);
    }
}