public class TryCatchDemo {
    public static void main(String[] args){
        // this is example use for see error number can't div 0
        try{
            int a=10;
            int b= 0;

            int result = a / b;
            
            System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program finished");
    }
}
