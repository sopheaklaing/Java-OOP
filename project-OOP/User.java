public abstract class User {

    // Encapsulation:
    // Keep data private so outside classes cannot access directly.
    private String name;
    private String email;


    // Constructor with parameters
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    // Getter: get name
    public String getName() {
        return name;
    }


    // Setter: set/change name
    public void setName(String name) {
        this.name = name;
    }


    // Getter: get email
    public String getEmail() {
        return email;
    }


    // Setter: set/change email
    public void setEmail(String email) {
        this.email = email;
    }


    // Normal method
    public void introduce() {
        System.out.println("My name is " + name);
        System.out.println("This is my email: " + email);
    }


    // Abstract method
    // Child class must implement this method.
    public abstract void login();
}