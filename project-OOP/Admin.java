public class Admin extends User {

    // Constructor
    public Admin(String name, String email) {
        super(name, email);
    }

    // Override User.login()
    @Override
    public void login() {
        System.out.println(
            getName() + " is logging in as Admin"
        );
    }

    // Admin's own method
    public void manageProduct(Product product) {
        System.out.println(
            getName()
            + " manages product: "
            + product.getName()
        );
    }
}