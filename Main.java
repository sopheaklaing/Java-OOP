public class Main {
    public static void main(String[] args){
        // 1 . this is create object and create product

        Product product = new Product(
            1,
            "Laptop",
            750
        );
        // this is for cell dispaly method product wirte in class product 
        product.displayProduct();
        

        //2 . this is create Customer 
        Customer customer  = new Customer(
            "sopheak", 
            "sopheak1234@gmail.com"
        );

        System.out.println("\n------Customer------");
        customer.introduce();
        customer.login();

        // 3. Customer buys Product

        System.out.println("\n----- Purchase -----");

        customer.buyProduct(product);

        // 4. Create Admin
         Admin admin = new Admin(
            "Admin",
            "admin@gmail.com"
        );

        System.out.println("\n----- Admin -----");

        admin.introduce();
        admin.login();

        // 5. Admin manages Product
        System.out.println("\n----- Product Management -----");

        admin.manageProduct(product);


         // 6. Polymorphism
         System.out.println("\n----- Polymorphism -----");

        User user1 = new Customer(
            "Dara",
            "dara@gmail.com"
        );

        User user2 = new Admin(
            "Manager",
            "manager@gmail.com"
        );

        user1.login();
        user2.login();


         // 7. Payment
         System.out.println("\n----- Payment -----");

        Payment payment = new Payment("PAY-001");

        payment.pay(product.getPrice());
    }
}
