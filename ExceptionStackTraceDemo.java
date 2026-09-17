public class ExceptionStackTraceDemo {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            e.printStackTrace();
        }

        System.out.println("Program finished");
    }
}