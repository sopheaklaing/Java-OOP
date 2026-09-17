// Functional Interface 1
interface Greeting {

    void sayHello();
}


// Functional Interface 2
interface GreetingName {

    void sayHello(String name);
}


// Functional Interface 3
interface Calculator {

    int add(int a, int b);
}


public class LambdaDemo {

    public static void main(String[] args) {
        //this is no use lambda 
        // Greeting greeting = new Greeting(){
        //     @Override 
        //     public void sayHello(){
        //         System.out.println("hello Sopheak");
        //     }
        // };
         

        // this is use lambda
        // 1. Lambda without parameter
        Greeting greeting = () ->
            System.out.println("Hello Sopheak");
        greeting.sayHello();

        // 2. Lambda with one parameter

        GreetingName greetingName = name ->
            System.out.println("Hello " + name);
        greetingName.sayHello("Dara");

        // 3. Lambda with multiple parameters

        Calculator calculator = (a, b) -> a + b;
        int result = calculator.add(10, 20);
        System.out.println("Result: " + result);
        // 4. Lambda with { } body

        Calculator calculator2 = (a, b) -> {
            int total = a + b;
            return total;
        };

        int result2 = calculator2.add(50, 30);
        System.out.println("Result 2: " + result2);
    }
}