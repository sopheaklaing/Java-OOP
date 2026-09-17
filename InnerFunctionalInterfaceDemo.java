@FunctionalInterface 
/**
 * FunctionalInterfaceDemo
 */
interface Greeting {
    void sayHello();  
}

// this is interface have parameter and value 
@FunctionalInterface 
/**
 * InnerInnerFunctionalInterfaceDemo
 */
interface Calculator {
    int add (int a , int b);
}

public class InnerFunctionalInterfaceDemo {
    // this is FunctionalInterfaceDemo
    public static void mian(String[] arge){
        Greeting greeting = () -> {
            System.out.println(" hello sopheak");
        };
        greeting.sayHello();


         // if have parameter and value write like this 
         Calculator calculator =(a,b) ->{
        return a + b;
    };
        // Call the method
        int result = calculator.add(10, 20);

        System.out.println("Result: " + result);  



        // this is nomoly 
    Greeting normalGreeting = new Greeting() {

            @Override
            public void sayHello() {
                System.out.println("Hello Sopheak - Normal Way");
        }
    };
    }

}
