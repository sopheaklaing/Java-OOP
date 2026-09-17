@FunctionalInterface 
/**
 * FunctionalInterfaceDemo
 */
interface FunctionalInterfaceDemo {
    void sayHello();  
}

public class InnerFunctionalInterfaceDemo {
    // this is FunctionalInterfaceDemo
    public static void mian(String[] arge){
        Greeting greeting = () -> {
            System.out.println(" hello sopheak");
        };
        greeting.sayHello();
        
    }

    // this is nomoly 
     Greeting normalGreeting = new Greeting() {

            @Override
            public void sayHello() {
                System.out.println("Hello Sopheak - Normal Way");
        }
    };
}
