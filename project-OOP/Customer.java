public class Customer extends User {

    // Constructor
    // Pass name and email to User constructor
    public Customer(String name, String email) {
        super(name, email);
    }

    // Override User.login()
    @Override
    public void login() {
        System.out.println(
            getName() + " is logging in as Customer"
        );
    }

    // Customer's own method
    public void buyProduct(Product product) {
        System.out.println(
            getName() + " bought "
            + product.getName()
            + " for $"
            + product.getPrice()
        );
    }
}