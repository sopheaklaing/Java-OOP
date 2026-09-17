import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        // Predicate receives a value
        // and returns true or false.

        Predicate<Integer> isAdult = age -> age >= 18;

        boolean result1 = isAdult.test(21);
        boolean result2 = isAdult.test(15);

        System.out.println("21 is adult: " + result1);
        System.out.println("15 is adult: " + result2);
    }
}