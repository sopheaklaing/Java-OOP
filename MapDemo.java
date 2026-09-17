import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> products = new HashMap<>();

        products.put(1, "Laptop");
        products.put(2, "Phone");
        products.put(3, "Mouse");

        System.out.println(products);
    }
}