import java.util.List;

public class StreamAllMatchDemo {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(
            10,
            20,
            30,
            40
        );

        // Check:
        // Are ALL numbers greater than 5?

        boolean result = numbers.stream()
            .allMatch(number -> number > 5);

        System.out.println("All numbers > 5: " + result);
    }
}