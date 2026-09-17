import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        // Function receives one value
        // and returns another value.

        Function<String, Integer> getLength = name -> {
            return name.length();
        };

        // Call the Function
        int result = getLength.apply("Sopheak");

        System.out.println("Length: " + result);
    }
}