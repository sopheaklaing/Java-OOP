import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        // Consumer receives one value
        // and returns nothing.

        Consumer<String> printName = name -> {
            System.out.println("Hello " + name);
        };

        // Call the Consumer
        printName.accept("Sopheak");
    }
}