public class ExceptionMessageDemo {
    public static void main(String[] srgs){
        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program finished");
    }
}
