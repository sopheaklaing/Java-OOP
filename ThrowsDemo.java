public class ThrowsDemo {

    public static void main(String[] args) {

        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    static void divide() throws ArithmeticException {

        int a = 10;
        int b = 0;

        int result = a / b;

        System.out.println("Result: " + result);
    }
}