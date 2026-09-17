import java.util.HashSet;
import java.util.Set;

public class SetDemo{
    public static void main(String[] args){
        Set<String> categories = new HashSet<>();

        categories.add("Laptop");
        categories.add("car");
        categories.add("home");
        categories.add("phone");
       
        categories.add("Laptop");

        System.out.println(categories);

        System.out.println("Size: " + categories.size());

        System.out.println(
            "Has Laptop: " + categories.contains("Laptop")
        );

        categories.remove("Phone");

        System.out.println(categories);
    }
}