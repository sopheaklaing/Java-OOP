import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        // Value exists
        Optional<String> name = Optional.of("Sopheak");

        System.out.println(name);

        // Check if value exists
        if (name.isPresent()) {
            System.out.println("Name: " + name.get());
        }

        // Value does not exist
        Optional<String> emptyName = Optional.empty();

        if (emptyName.isEmpty()) {
            System.out.println("Name not found");
        }

        // Default value
        String result = emptyName.orElse("Unknown");

        System.out.println("Result: " + result);
    }
}