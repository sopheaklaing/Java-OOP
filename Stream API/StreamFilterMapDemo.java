import java.util.ArrayList;
import java.util.List;


class Product{
        private int id;
        private  String name ;
        private double price;

        public Process(int id , String name , double price){
            this.id = id;
            this.name = name;
            this.price = price;
        }


        public String getName(){
            return name;
        }

        public  int getId(){
            return id;
        }

        public double getPrice(){
            return price;
        }


        
}

public class StreamFilterMapDemo {
    public static void main(String[] arge){
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 750));
        products.add(new Product(2, "Phone", 500));
        products.add(new Product(3, "Mouse", 25));
        products.add(new Product(4, "Keyboard", 80));

        // this path for Stream API
        List<String> result = products.stream()

        // this is get product true condition price >100
        .filter(product -> product.getPrice() > 100)
        // this is map use for Product Object to products name is mean like in class have name price id it just get name 
        .map(product -> product.getName())
        // this path for Convert Stream to List
        .toList();

         // Print result
        System.out.println(result);
    }
}
